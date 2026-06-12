package com.duoc.inkumanga.controller;

import com.duoc.inkumanga.model.Manga;
import com.duoc.inkumanga.service.MangaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MangaControllerTest {

    @Mock
    private MangaService mangaService;

    @InjectMocks
    private MangaController mangaController;

    @Test
    void agregarManga_retorna201_cuandoDatosValidos() {
        Manga manga = new Manga(1, "Naruto", "Acción", "Shueisha", "Historia de un ninja", List.of());

        when(mangaService.saveManga(manga)).thenReturn(manga);

        var respuesta = mangaController.agregarManga(manga);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.CREATED, respuesta.getStatusCode());

        var body = respuesta.getBody();
        assertNotNull(body);
        assertEquals("Naruto", body.getNombre_manga());
    }
}