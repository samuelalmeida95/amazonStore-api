package project.ifood.ifoodclone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.ifood.ifoodclone.models.Category;
import project.ifood.ifoodclone.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> allCategorys = CategoryService.findAll();
        return ResponseEntity.ok().body(allCategorys);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category categoriaBuscada = CategoryService.findById(id);
        return ResponseEntity.ok().body(categoriaBuscada);
    }
    
}
