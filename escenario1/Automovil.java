package escenario1;
public class Automovil {

    private String engine;
    private String color;
    private int tires;
    private String soundSystem;
    private boolean gpsNavigator;

    public Automovil() {

    }

    @Override
    public String toString() {
        return "patrones.escenario1.Automovil{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", tires=" + tires +
                ", soundSystem='" + soundSystem + '\'' +
                ", gpsNavigator=" + gpsNavigator +
                ", doors=" + doors +
                '}';
    }

    public int getDoors() {
        return doors;
    }

    public int setDoors(int doors) {
        this.doors = doors;
       return doors;
    }

    private int doors;

    public String getEngine() {
        return engine;
    }

    public String setEngine(String engine) {
        this.engine = engine;
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return color;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int plats) {
        this.tires = plats;
    }

    public String getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }

    public boolean isGpsNavigator() {
        return gpsNavigator;
    }

    public void setGpsNavigator(boolean gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Automovil(String engineType, String color, int tires, String soundSystem, boolean gpsNavigator) {
        this.engine = engineType;
        this.color = color;
        this.tires = tires;
        this.soundSystem = soundSystem;
        this.gpsNavigator = gpsNavigator;
    }
}

