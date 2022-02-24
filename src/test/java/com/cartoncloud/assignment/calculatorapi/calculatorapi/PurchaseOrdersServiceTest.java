package com.cartoncloud.assignment.calculatorapi.calculatorapi;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.client.PurchaseOrdersService;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseOrdersServiceTest {

    @Autowired
    private PurchaseOrdersService service;

    @Test
    public void testGetOrderDetails( ) {
        List<Integer> order = new ArrayList<>();
        order.add(2344);
        List<PurchaseOrder> result = service.getOrderDetails(order);
        assertNotNull(result);
    }
}
