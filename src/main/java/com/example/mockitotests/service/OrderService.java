package com.example.mockitotests.service;

import com.example.mockitotests.domain.Item;
import com.example.mockitotests.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.mockitotests.domain.Order.OrderStatus.SHIPPED;
import static java.util.Arrays.asList;

@Service
public class OrderService {

    public void getOrder(String orderId) {
        Order dummyOrder = new Order(orderId);
        dummyOrder.setOrderStatus(SHIPPED);
        dummyOrder.setOrderTotal(100);
        dummyOrder.setPromotionApplied(false);
        dummyOrder.setItems(getDummyItem());

    }

    private List<Item> getDummyItem() {
        Item dummyItem = new Item("1", "Product1", 2, 100);
        return asList(dummyItem);
    }
}
