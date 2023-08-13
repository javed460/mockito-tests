package com.example.mockitotests.domain;


import com.example.mockitotests.databuilders.AddressTestBuilder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddressTest {

    @Test
    public void testGetStreet() {
        Address address = AddressTestBuilder.builder().build();
        String street = address.getStreet();
        assertThat(street).isEqualTo("test line1 test line2");
    }

}