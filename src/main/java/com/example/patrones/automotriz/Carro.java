package com.example.patrones.automotriz;

import lombok.Data;

@Data
public class Carro {
    private String motor;
    private String color;
    private int llantas;
    private String sonido;
    private int asientos;
    private String techo;
    private Boolean navegador;
}
