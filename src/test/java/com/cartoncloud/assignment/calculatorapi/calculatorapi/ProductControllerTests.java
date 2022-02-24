package com.cartoncloud.assignment.calculatorapi.calculatorapi;


import com.cartoncloud.assignment.calculatorapi.calculatorapi.config.MyBasicAuthenticationEntryPoint;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.controller.ProductController;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderRequest;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MyBasicAuthenticationEntryPoint myBasicAuthenticationEntryPoint;

    @Autowired
    private WebApplicationContext context;

    @MockBean
    private OrderService orderService;

    @Autowired
    protected ObjectMapper objectMapper;

    @Test
    public void testcase1() throws Exception {
        MockMvcBuilders.webAppContextSetup(this.context)
                .apply(SecurityMockMvcConfigurers.springSecurity())
                .build();

        List<Integer> reqList = Arrays.asList(1,2,3);

        List<ProductGroupTotal> productGroupTotals = new ArrayList<>();
        ProductGroupTotal productGroupTotal1 = new ProductGroupTotal(1,new BigDecimal(12));
        ProductGroupTotal productGroupTotal2 = new ProductGroupTotal(2,new BigDecimal(13));
        ProductGroupTotal productGroupTotal3 = new ProductGroupTotal(3,new BigDecimal(14));
        productGroupTotals.add(productGroupTotal1);
        productGroupTotals.add(productGroupTotal2);
        productGroupTotals.add(productGroupTotal3);


        when(orderService.calculateOrderTotal(reqList)).thenReturn(productGroupTotals);

        PurchaseOrderRequest request = new PurchaseOrderRequest();
        request.setPurchaseOrderIds(reqList);

        this.mvc.perform(post("/test")
                        .with(httpBasic("demo","pwd1234"))
                .content(objectMapper.writeValueAsString(request))
                .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andExpect( jsonPath("$.result", hasSize(3)))
                .andExpect( jsonPath("$.result[0].total", is(12)))
                .andExpect( jsonPath("$.result[1].total", is(13)))
                .andExpect( jsonPath("$.result[2].total", is(14)))
                .andExpect( jsonPath("$.result[0].product_type_id", is(1)))
                .andExpect( jsonPath("$.result[1].product_type_id", is(2)))
                .andExpect( jsonPath("$.result[2].product_type_id", is(3)))
                .andReturn();
    }


}
