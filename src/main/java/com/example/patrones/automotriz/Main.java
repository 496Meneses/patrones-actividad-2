package com.example.patrones.automotriz;

import com.example.patrones.automotriz.gateway.ConstruirCarro;

public class Main {

    public static void main(String[] args) {
        constructCar(new EnsamblajeCarro());
        constructCar(new EnsamblajeCamioneta());
    }

    public static void constructCar(ConstruirCarro construirCarro) {
        construirCarro.construirMotor("V3");
        construirCarro.implementarColor("Azul");
        construirCarro.colocarLLantas(2);
        construirCarro.implementarSonido("Sony");
        construirCarro.instalarAsientos(4);
        construirCarro.implementarTecho("desplegable");
        construirCarro.instalarNavegacion(true);
        System.out.println(construirCarro.getResult());
    }
}
