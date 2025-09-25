package com.example.patrones.notificaciones;

import com.example.patrones.notificaciones.gateway.Plataforma;

public class NotificacionAlerta extends Notificacion{

    public NotificacionAlerta(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void notificar() {
        plataforma.notificar("Tienes una nueva alerta.");
    }
}
