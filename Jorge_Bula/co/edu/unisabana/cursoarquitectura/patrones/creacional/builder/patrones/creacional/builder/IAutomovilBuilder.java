package co.edu.unisabana.cursoarquitectura.patrones.creacional.builder.patrones.creacional.builder;

public interface IAutomovilBuilder {
    public void buildEngine(String engine);
    public void paintColor(String color);
    public void addSoundSystem(String sys);
    public void addGps(boolean gps);
    public void addTires(int tires);
    void instance();
    public Automovil buildAuto();
}
