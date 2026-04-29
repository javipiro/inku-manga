package com.duoc.inkumanga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.inkumanga.model.Usuario;
import com.duoc.inkumanga.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario getUsuarioId(int id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario updateUsuario(Usuario usuario) {
        if (!usuarioRepository.existsById(usuario.getId_us())) {
            return null;
        }
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);
    }
}