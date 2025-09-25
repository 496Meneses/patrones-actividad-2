package com.example.patrones.automotriz;

import com.example.patrones.automotriz.gateway.ConstruirCarro;
import lombok.Data;

@Data
public class EnsamblajeCamioneta implements ConstruirCarro {

    private final Carro carro;

    public EnsamblajeCamioneta() {
        this.carro = new Carro();
    }

    @Override
    public void construirMotor(String motor) {
        carro.setMotor(motor.concat(" Para camioneta"));
    }

    @Override
    public void implementarColor(String color) {
        carro.setColor(color.concat(" Para camioneta"));
    }

    @Override
    public void colocarLLantas(int llantas) {
       carro.setLlantas(llantas);
    }

    @Override
    public void implementarSonido(String sonido) {
        carro.setSonido(sonido.concat(" Para camioneta"));
    }

    @Override
    public void instalarAsientos(int asientos) {
        carro.setAsientos(asientos);
    }

    @Override
    public void implementarTecho(String techo) {
        carro.setTecho(techo.concat(" Para camioneta"));
    }

    @Override
    public void instalarNavegacion(Boolean navegador) {
        carro.setNavegador(true);
    }

    public Carro getResult() {
        return carro;
    }
}