package com.example.patrones.notificaciones;

import com.example.patrones.notificaciones.gateway.Plataforma;

public class NotificacionAdvertencia extends Notificacion{

    public NotificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void notificar() {
        plataforma.notificar("Tienes un nueva advertencia.");
    }

}
