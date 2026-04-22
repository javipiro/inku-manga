package com.duoc.inkumanga.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Table(name="mangas")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Manga {
    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Id
    private int id_manga;
    @NotBlank
    private String nombre_manga;
    @NotBlank
    private String genero;
    @NotBlank
    private String editorial;
    @NotBlank
    private String resumen;
}
