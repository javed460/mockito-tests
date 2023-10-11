package com.example.mockitotests.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleServiceTest {

    @InjectMocks
    private SampleService sampleService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAdd() {
        int result = sampleService.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testGreet() {
        String result = sampleService.greet("Alice");
        assertEquals("Hello, Alice!", result);
    }

    @Test
    public void testIsEven() {
        boolean result = sampleService.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

        double result = sampleService.calculateAverage(numbers);
        assertEquals(3.0, result, 0.01);
    }
}