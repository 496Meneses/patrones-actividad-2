package co.edu.unisabana.cursoarquitectura.patrones.creacional.builder.patrones.creacional.builder;

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
       /* patrones.escenario1.AutomovilBuilder builder= new patrones.escenario1.AutomovilBuilder();
        patrones.escenario1.DirectorBuilder director=new patrones.escenario1.DirectorBuilder();
        director.makeAuto(builder);
        patrones.escenario1.Automovil auto= builder.buildAuto();
        director.makeCamioneta(builder);
        patrones.escenario1.Automovil camioneta= builder.buildAuto();
        System.out.println("Auto creado:"+auto);
        System.out.println("Camioneta creado:"+camioneta);*/

    }
}
