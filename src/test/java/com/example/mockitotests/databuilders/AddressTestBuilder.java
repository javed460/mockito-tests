package com.example.mockitotests.databuilders;

import com.example.mockitotests.domain.Address;

public class AddressTestBuilder {
    private String line1 = "test line1";
    private String line2= "test line2";
    private String city = "London";
    private String pincode = "EA 123";
    private String country = "UK";

    public static AddressTestBuilder builder() {
        return new AddressTestBuilder();
    }

    public Address build() {
        Address address = new Address();
        address.setLine1(line1);
        address.setLine2(line2);
        address.setCity(city);
        address.setCountry(country);
        address.setPincode(pincode);
        return address;
    }

}
