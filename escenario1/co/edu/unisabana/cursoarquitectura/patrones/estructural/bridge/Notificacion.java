package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public abstract class Notificacion {
    protected IPlataforma plataforma;

    public Notificacion(IPlataforma plataforma) {
        this.plataforma = plataforma;
    }
    public abstract void enviar();
}
