package com.example.mockitotests.domain;

import lombok.Data;

@Data
public class Address {
    private String line1;
    private String line2;
    private String city;
    private String pincode;
    private String country;

    public String getStreet() {
        return line1 + " " + line2;
    }
}
