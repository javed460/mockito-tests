package com.example.mockitotests.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String productId;
    private String productName;
    private int quantity;
    private double price;
}