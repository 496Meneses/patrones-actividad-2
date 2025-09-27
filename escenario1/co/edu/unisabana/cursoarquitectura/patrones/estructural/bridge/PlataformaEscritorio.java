package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class PlataformaEscritorio implements IPlataforma{
    public PlataformaEscritorio() {
    }
    @Override
    public void mostrar(String mensaje) {
        System.out.println("[Desktop]:"+mensaje);
    }
}
