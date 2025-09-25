package com.example.patrones.notificaciones;

import com.example.patrones.notificaciones.gateway.Plataforma;

public class Web implements Plataforma {

    @Override
    public void notificar(String contenido) {
        System.out.println(contenido.concat(" por tu dispositivo Web."));
    }
}
