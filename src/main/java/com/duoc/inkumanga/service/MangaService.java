package com.duoc.inkumanga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.inkumanga.dto.MangaAutorDTO;
import com.duoc.inkumanga.model.Manga;
import com.duoc.inkumanga.repository.AutorRepository;
import com.duoc.inkumanga.repository.MangaRepository;

import java.util.List;

@Service
public class MangaService {

    @Autowired
    private MangaRepository mangaRepository;

    @Autowired
    private AutorRepository autorRepository;

    public List<Manga> getMangas() {
        return mangaRepository.findAll();
    }

    public Manga saveManga(Manga manga) {
        return mangaRepository.save(manga);
    }

    public Manga getMangaId(int id) {
        return mangaRepository.findById(id).orElse(null);
    }

    public Manga updateManga(Manga manga) {
        if (!mangaRepository.existsById(manga.getId_manga())) {
            return null;
        }
        return mangaRepository.save(manga);
    }

    public void deleteManga(int id) {
        mangaRepository.deleteById(id);
    }

    public List<MangaAutorDTO> getMangasConAutor() {
        return autorRepository.findAll().stream()
                .flatMap(autor -> autor.getManga().stream()
                        .map(manga -> new MangaAutorDTO(
                                manga.getNombre_manga(),
                                manga.getGenero(),
                                autor.getNombre_au()
                        )))
                .toList();
    }
}