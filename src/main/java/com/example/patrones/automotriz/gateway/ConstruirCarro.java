package com.example.patrones.automotriz.gateway;

import com.example.patrones.automotriz.Carro;

public interface ConstruirCarro {

    void construirMotor(String motor);
    void implementarColor(String color);
    void colocarLLantas(int llantas);
    void implementarSonido(String sonido);
    void instalarAsientos(int asientos);
    void implementarTecho(String techo);
    void instalarNavegacion(Boolean navegador);
    Carro getResult();
}