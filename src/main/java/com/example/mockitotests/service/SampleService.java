package com.example.mockitotests.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    public int add(int a, int b) {
        return a + b;
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return (double) sum / numbers.size();
    }
}
