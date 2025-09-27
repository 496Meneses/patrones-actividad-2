package Escenario2.TiposDeDispositivos;

public class Movil implements Dispositivo {
    @Override
    public void mostrarNotificacion(String mensaje) {
        System.out.println("Mensaje tipo MOVIL: " + mensaje);
    }
}
