package project.ifood.ifoodclone.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.ifood.ifoodclone.models.Product;
import project.ifood.ifoodclone.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> produtoBuscado = productRepository.findById(id);
        return produtoBuscado.get();
    }
}
