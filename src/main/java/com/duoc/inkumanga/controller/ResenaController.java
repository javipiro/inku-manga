package com.duoc.inkumanga.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.duoc.inkumanga.model.Resena;
import com.duoc.inkumanga.service.ResenaService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resenas")
public class ResenaController {

    @Autowired
    private ResenaService resenaService;

    @GetMapping
    public ResponseEntity<List<Resena>> listarResenas() {
        return ResponseEntity.ok(resenaService.getResenas());
    }

    @PostMapping
    public ResponseEntity<Resena> agregarResena(@Valid @RequestBody Resena resena) {
        return ResponseEntity.status(HttpStatus.CREATED).body(resenaService.saveResena(resena));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resena> buscarResena(@PathVariable int id) {
        Resena resena = resenaService.getResenaId(id);
        if (resena == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(resena);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resena> actualizarResena(@PathVariable int id, @Valid @RequestBody Resena resena) {
        resena.setId_re(id);
        Resena actualizada = resenaService.updateResena(resena);
        if (actualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarResena(@PathVariable int id) {
        resenaService.deleteResena(id);
        return ResponseEntity.noContent().build();
    }
}