package project.ifood.ifoodclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.ifood.ifoodclone.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
