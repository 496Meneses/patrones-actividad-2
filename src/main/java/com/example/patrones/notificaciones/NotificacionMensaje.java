package com.example.patrones.notificaciones;

import com.example.patrones.notificaciones.gateway.Plataforma;

public class NotificacionMensaje extends Notificacion{

    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void notificar() {
        plataforma.notificar("Tienes un nuevo mensaje.");
    }

}
