package project.ifood.ifoodclone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.ifood.ifoodclone.models.User;
import project.ifood.ifoodclone.services.UserService;

@RestController
@RequestMapping(value= "/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> allUsers = userService.findAll(); 
        return ResponseEntity.ok().body(allUsers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User userById = userService.findById(id); 
        return ResponseEntity.ok().body(userById);
    }
}
