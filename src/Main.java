import src.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", 2020, 500);
        Vehiculo v2 = new Vehiculo("DEF456", "Ford", 2018, 800);
        Vehiculo v3 = new Vehiculo("GHI789", "Renault", 2022, 600);

        v1.mostrarInformacion();
        System.out.println();
        v2.mostrarInformacion();
        System.out.println();
        v3.mostrarInformacion();
    }
}
