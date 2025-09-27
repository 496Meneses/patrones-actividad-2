package co.edu.unisabana.cursoarquitectura.patrones.creacional.builder;

public class AutomovilBuilder implements IAutomovilBuilder {
private Automovil auto;

    public AutomovilBuilder() {
    }
    @Override
    public void instance() {
        auto = new Automovil();
    }
    @Override
    public void buildEngine(String engine) {
         auto.setEngine(engine);
    }

    @Override
    public void paintColor(String color) {
         auto.setColor(color);
    }

    @Override
    public void addSoundSystem(String sys) {
        auto.setSoundSystem(sys);
    }

    @Override
    public void addGps(boolean gps) {
        auto.setGpsNavigator(gps);
    }

    @Override
    public void addTires(int tires) {
        auto.setTires(tires);
    }

    @Override
    public Automovil buildAuto() {
        return auto;
    }

}
