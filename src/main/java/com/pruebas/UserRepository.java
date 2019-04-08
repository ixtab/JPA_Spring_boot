package com.pruebas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
