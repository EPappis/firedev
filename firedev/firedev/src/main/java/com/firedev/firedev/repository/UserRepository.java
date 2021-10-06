/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firedev.firedev.repository;

import com.firedev.firedev.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author epapp
 */
public interface UserRepository extends JpaRepository<usuario, Integer> {

}
