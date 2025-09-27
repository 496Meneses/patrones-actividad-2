package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class Advertencia extends Notificacion{
    public Advertencia(IPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar() {
        plataforma.mostrar("Advertencia: Revisar configuración");
    }
}
