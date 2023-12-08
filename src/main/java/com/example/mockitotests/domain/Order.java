package com.example.mockitotests.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {

    private static final double TAX_RATE = 0.1;
    private String orderId;
    private List<Item> items;
    private double orderTotal;
    private boolean isPromotionApplied;
    private OrderStatus orderStatus;

    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.orderStatus = OrderStatus.CREATED;
    }

    public void addItem(Item item) {
        items.add(item);
        calculateOrderTotal();
    }

    public void applyPromotion() {
        isPromotionApplied = true;
        calculateOrderTotal();
    }

    public void markAsShipped() {
        if (orderStatus == OrderStatus.CREATED || orderStatus == OrderStatus.PROMOTION_APPLIED) {
            throw new IllegalStateException("Cannot ship an order that is not confirmed.");
        }
        orderStatus = OrderStatus.SHIPPED;
    }

    private void calculateOrderTotal() {
        orderTotal = items.stream()
                .mapToDouble(item -> item.getQuantity() * item.getPrice())
                .sum();

        if (isPromotionApplied) {
            double discountAmount = orderTotal * 0.1;
            orderTotal -= discountAmount;
        }

        orderTotal += orderTotal * TAX_RATE;
    }

    public enum OrderStatus {
        CREATED, PROMOTION_APPLIED, SHIPPED
    }

}
