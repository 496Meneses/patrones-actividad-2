package com.example.patrones.automotriz;

import com.example.patrones.automotriz.gateway.ConstruirCarro;

public class EnsamblajeCarro implements ConstruirCarro {

    private final Carro carro;

    public EnsamblajeCarro() {
        this.carro = new Carro();
    }

    @Override
    public void construirMotor(String motor) {
        carro.setMotor(motor.concat(" Para sedan"));
    }

    @Override
    public void implementarColor(String color) {
        carro.setColor(color.concat(" Para sedan"));
    }

    @Override
    public void colocarLLantas(int llantas) {
       carro.setLlantas(llantas);
    }

    @Override
    public void implementarSonido(String sonido) {
        carro.setSonido(sonido.concat(" Para sedan"));
    }

    @Override
    public void instalarAsientos(int asientos) {
        carro.setAsientos(asientos);
    }

    @Override
    public void implementarTecho(String techo) {
        carro.setTecho(techo.concat(" Para sedan"));
    }

    @Override
    public void instalarNavegacion(Boolean navegador) {
        carro.setNavegador(true);
    }

    @Override
    public Carro getResult() {
        return carro;
    }
}