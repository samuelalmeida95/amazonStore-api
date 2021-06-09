package project.ifood.ifoodclone.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.ifood.ifoodclone.models.Category;
import project.ifood.ifoodclone.repository.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> categoriaBuscada = categoryRepository.findById(id);
        return categoriaBuscada.get();
    }
}
