package project.ifood.ifoodclone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.ifood.ifoodclone.model.User;

@RestController
@RequestMapping(value= "/users")
public class UserController {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "John", "john@example", "999999", "44444");
        return ResponseEntity.ok().body(user);
    }
}
