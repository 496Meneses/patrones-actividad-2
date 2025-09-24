package Escenario1;

public class MainEscenario1 {
    public static void main(String[] args) {

        System.out.println("Patrón builder, crear automoviles -------------");
        Automovil automovilModelo2025 = new Automovil.BuilderAutomovil()
                .setColor("Rojo")
                .setEsElectrico(true)
                .setMotor("Sin motor")
                .setSonido("7.1")
                .setTieneGps(true)
                .build();
        Automovil automovilModelo2024 = new Automovil.BuilderAutomovil()
                .setColor("Azul")
                .setEsElectrico(false)
                .setMotor("1.6")
                .setSonido("7.1")
                .setTieneGps(true)
                .build();
        Automovil automovilModelo2023 = new Automovil.BuilderAutomovil()
                .setColor("Amarillo")
                .setEsElectrico(false)
                .setMotor("3.0")
                .setSonido("Estereo")
                .setTieneGps(false)
                .build();

        System.out.println("Auto 2025 " + automovilModelo2025.toString());
        System.out.println("Auto 2024 " + automovilModelo2024.toString());
        System.out.println("Auto 2023 " + automovilModelo2023.toString());
    }
}