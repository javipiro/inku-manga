package com.duoc.inkumanga.Model;

import org.springframework.format.annotation.DateTimeFormat;

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
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usuarios")
@Entity
public class Usuario {
    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int id_us;
    @NotBlank
    private String nombre_us;
    @NotBlank
    private String correo;
    @NotNull
    private int fecha_nac_us;
}
