package com.firedev.firedev.controller;

import com.firedev.firedev.model.usuario;
import com.firedev.firedev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/listar")
    public List<usuario> list() {
        return userService.listAllUser();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<usuario> get(@PathVariable int id) {
        try {
            usuario user = userService.getUser(id);
            return new ResponseEntity<usuario>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<usuario>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/inserir")
    public void add(@RequestBody usuario user) {
        userService.saveUser(user);
    }
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> update(@RequestBody usuario user, @PathVariable int id) {
        try {
            usuario existUser = userService.getUser(id);
            user.setId(id);
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {

        userService.deleteUser(id);
    }
}
