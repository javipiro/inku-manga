package com.duoc.inkumanga.dto;

import lombok.Data;
@Data

public class AuthRequest {
    private String username;
    private String password;
    private String correo;       
    private String nombre_us;    
    private Integer fecha_nac_us;
}