package Escenario2.TiposDeDispositivos;

public class Escritorio implements Dispositivo {
    @Override
    public void mostrarNotificacion(String mensaje) {
        System.out.println("Mensaje tipo ESCRITORIO: " + mensaje);

    }
}
