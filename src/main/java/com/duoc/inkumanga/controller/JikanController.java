package com.duoc.inkumanga.controller;

import com.duoc.inkumanga.dto.JikanMangaDTO;
import com.duoc.inkumanga.service.JikanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jikan")
public class JikanController {

    @Autowired
    private JikanService jikanService;

    /**
     * GET /api/v1/jikan/manga/{id}
     * Ej: /api/v1/jikan/manga/1  → Monster
     */
    @GetMapping("/manga/{id}")
    public ResponseEntity<JikanMangaDTO> getManga(@PathVariable int id) {
        JikanMangaDTO resultado = jikanService.obtenerMangaPorId(id);
        return ResponseEntity.ok(resultado);
    }

    /**
     * GET /api/v1/jikan/manga/buscar?q=berserk
     */
    @GetMapping("/manga/buscar")
    public ResponseEntity<Object> buscarManga(@RequestParam String q) {
        return ResponseEntity.ok(jikanService.buscarManga(q));
    }
}