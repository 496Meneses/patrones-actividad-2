package com.example.patrones.notificaciones;

import com.example.patrones.notificaciones.gateway.Plataforma;
import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Notificacion {

    protected Plataforma plataforma;

    public abstract void notificar();
}
