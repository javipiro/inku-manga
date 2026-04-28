package com.duoc.inkumanga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name="resenas")
public class Resena {
    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private int id_re;
    private String comentario;
    private int calificacion;
    private String fecha_re;
}
