package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class PlataformaMovil implements IPlataforma{
    @Override
    public void mostrar(String mensaje) {
        System.out.println("[Movil]:"+mensaje);
    }
}
