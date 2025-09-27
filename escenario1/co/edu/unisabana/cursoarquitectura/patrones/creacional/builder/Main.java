package co.edu.unisabana.cursoarquitectura.patrones.creacional.builder;

public class Main {

    public static void main(String[] args) {
        //Implementación con clase tipo director
        AutomovilBuilder builder= new AutomovilBuilder();
        DirectorBuilder director=new DirectorBuilder();
        director.makeAuto(builder);
        Automovil auto= builder.buildAuto();
        builder= new AutomovilBuilder();
        director.makeCamioneta(builder);
        Automovil camioneta= builder.buildAuto();
        System.out.println("Auto creado:"+auto);
        System.out.println("Camioneta creado:"+camioneta);

    }
}
