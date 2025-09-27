package Escenario2.TiposDeNotificacion;

import Escenario2.TiposDeDispositivos.Dispositivo;

public class Mensaje extends Notificacion {
    public Mensaje(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void enviar() {
        dispositivo.mostrarNotificacion("Notificación de MENSAJE ");
    }
}
