package com.example.mockitotests.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order("123");
    }

    @Test
    void testAddItemAndCalculateTotal() {
        Item item1 = new Item("1", "Product1", 2, 10.0);
        Item item2 = new Item("2", "Product2", 3, 15.0);

        order.addItem(item1);
        order.addItem(item2);

        assertEquals(71.5, order.getOrderTotal());
    }

    @Test
    void testApplyPromotionAndCalculateTotal() {
        Item item1 = new Item("1", "Product1", 2, 10.0);
        Item item2 = new Item("2", "Product2", 3, 15.0);

        order.addItem(item1);
        order.addItem(item2);

        order.applyPromotion();

        assertEquals(64.35, order.getOrderTotal());
    }

}