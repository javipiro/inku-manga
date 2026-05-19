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

    @GetMapping("/manga/{id}")
    public ResponseEntity<JikanMangaDTO> getManga(@PathVariable int id) {
        System.out.println("[JikanController] -> getManga id=" + id);
        JikanMangaDTO resultado = jikanService.obtenerMangaPorId(id);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/manga/buscar")
    public ResponseEntity<Object> buscarManga(@RequestParam String q) {
        System.out.println("[JikanController] -> buscarManga q=" + q);
        return ResponseEntity.ok(jikanService.buscarManga(q));
    }
}