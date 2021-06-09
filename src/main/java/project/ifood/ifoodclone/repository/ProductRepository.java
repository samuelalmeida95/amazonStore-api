package project.ifood.ifoodclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.ifood.ifoodclone.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
