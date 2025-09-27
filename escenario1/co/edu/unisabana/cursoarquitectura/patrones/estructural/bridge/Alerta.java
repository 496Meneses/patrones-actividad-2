package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class Alerta extends Notificacion{
    public Alerta(IPlataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar() {
        plataforma.mostrar("Alerta:¡Revisar pronto ");
    }
}
