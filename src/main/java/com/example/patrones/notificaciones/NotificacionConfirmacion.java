package com.example.patrones.notificaciones;

import com.example.patrones.notificaciones.gateway.Plataforma;

public class NotificacionConfirmacion extends Notificacion{

    public NotificacionConfirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void notificar() {
        plataforma.notificar("Tienes un nueva confirmacion.");
    }

}
