package Escenario1;

public interface IAutomovilBuilder {
    void buildEngine(String engine);
    void paintColor(String color);
    void addSoundSystem(String sys);
    void addGps(boolean gps);
    void addTires(int tires);
    Automovil buildAuto();
}
