package Escenario3;

import Escenario2.TiposDeDispositivos.Dispositivo;
import Escenario2.TiposDeDispositivos.Escritorio;
import Escenario2.TiposDeDispositivos.Movil;
import Escenario2.TiposDeDispositivos.Web;
import Escenario2.TiposDeNotificacion.Alerta;
import Escenario2.TiposDeNotificacion.Confirmacion;
import Escenario2.TiposDeNotificacion.Mensaje;
import Escenario2.TiposDeNotificacion.Notificacion;

public class MainEscenario3 {
    public static void main(String[] args) {
        ChatMediator chat = new ConcreteChatMediator();

        Usuario goku = new Usuario(chat, "Goku");
        Usuario vegeta = new Usuario(chat, "Vegeta");
        Usuario krilin = new Usuario(chat, "Krilin");

        chat.agregarUsuarioAChat(goku);
        chat.agregarUsuarioAChat(vegeta);
        chat.agregarUsuarioAChat(krilin);

        goku.enviarMensaje("¡Hola soy goku!");
        vegeta.enviarMensaje("Savandija!");
        krilin.enviarMensaje("Hola!");

    }
}