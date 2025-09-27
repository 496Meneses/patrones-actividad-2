package Escenario2.TiposDeNotificacion;

import Escenario2.TiposDeDispositivos.Dispositivo;

public class Confirmacion extends Notificacion {
    public Confirmacion(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void enviar() {
        dispositivo.mostrarNotificacion("Notificación de CONFIRMACION");
    }
}
