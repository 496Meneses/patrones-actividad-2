package Escenario2.TiposDeNotificacion;

import Escenario2.TiposDeDispositivos.Dispositivo;

public class Alerta extends Notificacion {
    public Alerta(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void enviar() {
        dispositivo.mostrarNotificacion("Notificación de ALERTA");
    }
}
