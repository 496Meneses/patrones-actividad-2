package co.edu.unisabana.cursoarquitectura.patrones.creacional.builder;

public class Main {

    public static void main(String[] args) {
        //Implementación sin clase tipo director
        AutomovilBuilder builder= new AutomovilBuilder();
        builder.instance();
        builder.buildEngine("V8");
        builder.paintColor("red");
        builder.addSoundSystem("bose");
        builder.addGps(true);
        Automovil auto= builder.buildAuto();
        System.out.println("Auto creado:"+auto);

        //Implementación con clase tipo director
      /* AutomovilBuilder builder= new AutomovilBuilder();
        DirectorBuilder director=new DirectorBuilder();
        director.makeAuto(builder);
        director.instance();
        director.makeCamioneta(builder);
        Automovil auto= builder.buildAuto();
        Automovil camioneta= builder.buildAuto();
        System.out.println("Auto creado:"+auto);
        //System.out.println("Camioneta creado:"+camioneta);*/

    }
}
