package com.example.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_rest.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
