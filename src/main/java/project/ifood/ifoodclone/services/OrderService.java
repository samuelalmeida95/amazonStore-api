package project.ifood.ifoodclone.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.ifood.ifoodclone.models.Order;
import project.ifood.ifoodclone.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> usuarioBuscado = orderRepository.findById(id);
        return usuarioBuscado.get();
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }
}
