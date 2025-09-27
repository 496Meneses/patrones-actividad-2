package Escenario2;

import Escenario2.TiposDeDispositivos.*;
import Escenario2.TiposDeNotificacion.Alerta;
import Escenario2.TiposDeNotificacion.Confirmacion;
import Escenario2.TiposDeNotificacion.Mensaje;
import Escenario2.TiposDeNotificacion.Notificacion;

public class MainEscenario2 {
    public static void main(String[] args) {
        Dispositivo web = new Web();
        Dispositivo movil = new Movil();
        Dispositivo escritorio = new Escritorio();


        Notificacion mensajeParaWeb = new Mensaje(web);
        Notificacion alertaParaMovil = new Alerta(movil);
        Notificacion alertaParaWeb = new Alerta(web);
        Notificacion confirmacionParaEscritorio = new Confirmacion(escritorio);

        mensajeParaWeb.enviar();
        alertaParaMovil.enviar();
        alertaParaWeb.enviar();
        confirmacionParaEscritorio.enviar();
    }
}