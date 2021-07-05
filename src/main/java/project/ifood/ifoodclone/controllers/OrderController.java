package project.ifood.ifoodclone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import project.ifood.ifoodclone.models.Order;
import project.ifood.ifoodclone.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> allOrders = orderService.findAll();
        return ResponseEntity.ok().body(allOrders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order orderById = orderService.findById(id);
        return ResponseEntity.ok().body(orderById);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@PathVariable Order order){
        return orderService.create(order);
    }
}
