package Escenario1;

public class DirectorBuilder {
    public void makeAuto(AutomovilBuilder builder){
        builder.buildEngine("V8");
        builder.paintColor("red");
        builder.addSoundSystem("bose");
        builder.addGps(true);
    }
    public void makeCamioneta(AutomovilBuilder builder) {
        builder.buildEngine("V4");
        builder.paintColor("Plateado");
        builder.addTires(4);
    }
}
