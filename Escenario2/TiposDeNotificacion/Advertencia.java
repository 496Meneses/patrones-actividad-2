package Escenario2.TiposDeNotificacion;

import Escenario2.TiposDeDispositivos.Dispositivo;

public class Advertencia extends Notificacion {
    public Advertencia(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void enviar() {
        dispositivo.mostrarNotificacion("Notificación de ADVERTENCIA: ");
    }
}
