package com.duoc.inkumanga.service;

import com.duoc.inkumanga.dto.JikanMangaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class JikanService {

    @Autowired
    @Qualifier("jikanWebClient")
    private WebClient jikanWebClient;

    /**
     * Busca información de un manga por su ID de MyAnimeList.
     * Ej: 1 = Monster, 2 = Berserk, 13 = One Piece
     */
    public JikanMangaDTO obtenerMangaPorId(int malId) {
        return jikanWebClient.get()
                .uri("/manga/{id}", malId)
                .retrieve()
                .bodyToMono(JikanMangaDTO.class)
                .block();
    }

    /**
     * Busca mangas por título (query string).
     * Devuelve el DTO tal cual (incluye lista de resultados en data[])
     */
    public Object buscarManga(String query) {
        return jikanWebClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/manga")
                        .queryParam("q", query)
                        .queryParam("limit", 5)
                        .build())
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }
}