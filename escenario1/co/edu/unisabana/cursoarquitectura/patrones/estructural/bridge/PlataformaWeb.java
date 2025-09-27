package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class PlataformaWeb implements IPlataforma{
    public PlataformaWeb() {
    }

    @Override
    public void mostrar(String mensaje) {
        System.out.println("[Web]:"+mensaje);
    }
}
