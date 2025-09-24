package Escenario1;

public class Automovil {


    private String motor;
    private String color;
    private String sonido;
    private Boolean esElectrico;
    private Boolean tieneGps;

    public Automovil(BuilderAutomovil builderAutomovil) {
        this.motor = builderAutomovil.motor;
        this.color = builderAutomovil.color;
        this.sonido = builderAutomovil.sonido;
        this.esElectrico = builderAutomovil.esElectrico;
        this.tieneGps = builderAutomovil.tieneGps;
    }

    public Automovil(String motor, String color, String sonido, Boolean esElectrico, Boolean tieneGps) {
        this.motor = motor;
        this.color = color;
        this.sonido = sonido;
        this.esElectrico = esElectrico;
        this.tieneGps = tieneGps;
    }

    @Override
    public String toString() {
        return "Automovil {" +
                "motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", esElectrico='" + esElectrico + '\'' +
                ", sonido='" + sonido + '\'' +
                ", tieneGps='" + tieneGps + '\'' +
                '}';
    }
    public static  class BuilderAutomovil {

        private String motor;
        private String color;
        private String sonido;
        private Boolean esElectrico;
        private Boolean tieneGps;


        public BuilderAutomovil setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public BuilderAutomovil setColor(String color) {
            this.color = color;
            return this;
        }

        public BuilderAutomovil setSonido(String sonido) {
            this.sonido = sonido;
            return this;
        }

        public BuilderAutomovil setTieneGps(boolean tieneGps) {
            this.tieneGps = tieneGps;
            return this;
        }

        public BuilderAutomovil setEsElectrico(boolean esElectrico) {
            this.esElectrico = esElectrico;
            return this;
        }

        public Automovil build() {
            return new Automovil(this);
        }
    }

    public String getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public String getSonido() {
        return sonido;
    }

    public Boolean getEsElectrico() {
        return esElectrico;
    }

    public Boolean getTieneGps() {
        return tieneGps;
    }
}
