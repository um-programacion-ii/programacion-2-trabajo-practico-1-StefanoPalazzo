package src;

import src.Vehiculo;
import src.service.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", 2020, 500);
        Vehiculo v2 = new Vehiculo("DEF456", "Ford", 2018, 800);
        Vehiculo v3 = new Vehiculo("GHI789", "Renault", 2022, 600);
        Camion camion = new Camion("JFK111", "Scania", 2023, 3000, true);



        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimirInformacion(v1);
        System.out.println();
        printer.imprimirInformacion(v2);
        System.out.println();
        printer.imprimirInformacion(v3);
        System.out.println();
        printer.imprimirInformacion(camion);
    }
}
