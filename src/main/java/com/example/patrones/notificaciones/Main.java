package com.example.patrones.notificaciones;

public class Main {
    public static void main(String[] args) {
        Notificacion juan = new NotificacionMensaje(new Web());
        juan.notificar();
        Notificacion pedro = new NotificacionAlerta(new Movil());
        pedro.notificar();
        Notificacion camila = new NotificacionAdvertencia(new Escritorio());
        camila.notificar();
        Notificacion jose = new NotificacionConfirmacion(new Web());
        jose.notificar();
    }
}


