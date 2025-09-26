package co.edu.unisabana.cursoarquitectura.patrones.creacional.builder.patrones.creacional.builder;

public class DirectorBuilder {
    public void makeAuto(AutomovilBuilder builder){
        builder.instance();
        builder.buildEngine("V8");
        builder.paintColor("red");
        builder.addSoundSystem("bose");
        builder.addGps(true);
    }
    public void makeCamioneta(AutomovilBuilder builder) {
        builder.instance();
        builder.buildEngine("V4");
        builder.paintColor("Plateado");
        builder.addTires(4);
    }
}
