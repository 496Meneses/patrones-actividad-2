package Escenario2.TiposDeNotificacion;

import Escenario2.TiposDeDispositivos.Dispositivo;

public abstract class Notificacion {
    protected Dispositivo dispositivo;

    public Notificacion(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void enviar();
}
