package com.duoc.inkumanga.repository;

import com.duoc.inkumanga.model.UsuarioSpringSecurity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioSpringSecurityRepository
        extends JpaRepository<UsuarioSpringSecurity, Integer> {

    Optional<UsuarioSpringSecurity> findByUsername(String username);
}