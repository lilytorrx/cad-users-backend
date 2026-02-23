package com.api.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="https://cad-users-frontend.vercel.app/")
@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}
