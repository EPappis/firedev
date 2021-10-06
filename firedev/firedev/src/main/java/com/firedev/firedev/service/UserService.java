/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firedev.firedev.service;

import com.firedev.firedev.model.usuario;
import com.firedev.firedev.repository.UserRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author epapp
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<usuario> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(usuario user) {
        userRepository.save(user);
    }

    public usuario getUser(int id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
