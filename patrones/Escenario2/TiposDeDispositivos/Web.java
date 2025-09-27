package Escenario2.TiposDeDispositivos;

public class Web implements Dispositivo {
    @Override
    public void mostrarNotificacion(String mensaje) {
        System.out.println("Mensaje tipo WEB: " + mensaje);
    }
}
