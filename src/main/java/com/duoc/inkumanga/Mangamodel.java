package com.duoc.inkumanga;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mangas")
public class Mangamodel {
    @NotNull
    @GeneratedValue
    @Id
    private int id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String genero;
    @NotBlank
    private String editorial;
    @NotBlank
    private String resumen;
    

}
