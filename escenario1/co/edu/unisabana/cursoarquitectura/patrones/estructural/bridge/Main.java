package co.edu.unisabana.cursoarquitectura.patrones.estructural.bridge;

public class Main {
  public static void main(String [] args){
      Notificacion notificacion1= new Mensaje(new PlataformaEscritorio());
      Notificacion notificacion2= new Alerta(new PlataformaMovil());
      Notificacion notificacion3= new Advertencia(new PlataformaEscritorio());
      notificacion1.enviar();
      notificacion2.enviar();
      notificacion3.enviar();

  }
}
