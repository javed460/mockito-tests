package com.example.mockitotests.controller;

import com.example.mockitotests.domain.Order;
import com.example.mockitotests.dto.OrderDTO;
import com.example.mockitotests.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping(value ="/order/{id}")
    public OrderDTO getOrder(@PathVariable("id") String id) {
        Order order = orderService.getOrder(id);

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId(order.getOrderId());
        orderDTO.setOrderStatus(order.getOrderStatus().name());
        return orderDTO;
    }
}
