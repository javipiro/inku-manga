package com.duoc.inkumanga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MangaAutorDTO {

    private String nombreManga;
    private String genero;
    private String nombreAutor;
}