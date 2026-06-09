package com.duoc.inkumanga.repository;

import com.duoc.inkumanga.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorySpringSecurity extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername(String username);
}