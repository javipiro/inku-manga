package com.duoc.inkumanga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.inkumanga.model.Resena;
import com.duoc.inkumanga.repository.ResenaRepository;

import java.util.List;

@Service
public class ResenaService {

    @Autowired
    private ResenaRepository resenaRepository;

    public List<Resena> getResenas() {
        return resenaRepository.findAll();
    }

    public Resena saveResena(Resena resena) {
        return resenaRepository.save(resena);
    }

    public Resena getResenaId(int id) {
        return resenaRepository.findById(id).orElse(null);
    }

    public Resena updateResena(Resena resena) {
        if (!resenaRepository.existsById(resena.getId_re())) {
            return null;
        }
        return resenaRepository.save(resena);
    }

    public void deleteResena(int id) {
        resenaRepository.deleteById(id);
    }
}