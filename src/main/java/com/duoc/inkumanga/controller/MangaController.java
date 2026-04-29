package com.duoc.inkumanga.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.duoc.inkumanga.dto.MangaAutorDTO;
import com.duoc.inkumanga.model.Manga;
import com.duoc.inkumanga.service.MangaService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mangas")
public class MangaController {

    @Autowired
    private MangaService mangaService;

    @GetMapping
    public ResponseEntity<List<Manga>> listarMangas() {
        return ResponseEntity.ok(mangaService.getMangas());
    }

    @PostMapping
    public ResponseEntity<Manga> agregarManga(@Valid @RequestBody Manga manga) {
        return ResponseEntity.status(HttpStatus.CREATED).body(mangaService.saveManga(manga));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manga> buscarManga(@PathVariable int id) {
        Manga manga = mangaService.getMangaId(id);
        if (manga == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(manga);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manga> actualizarManga(@PathVariable int id, @Valid @RequestBody Manga manga) {
        manga.setId_manga(id);
        Manga actualizado = mangaService.updateManga(manga);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarManga(@PathVariable int id) {
        mangaService.deleteManga(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/con-autor")
    public ResponseEntity<List<MangaAutorDTO>> mangasConAutor() {
        return ResponseEntity.ok(mangaService.getMangasConAutor());
    }
}