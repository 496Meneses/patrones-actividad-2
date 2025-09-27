package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class Mensaje extends Notificacion{

    public Mensaje(IPlataforma plataforma) {
        super(plataforma);
    }
    @Override
    public void enviar() {
    plataforma.mostrar("Mensaje: Tienes nuevo mensaje");
    }
}
