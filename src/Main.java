package src;

import src.Vehiculo;
import src.service.VehiculoPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("AAA123", "Ford", 2010, 1500));
        vehiculos.add(new Camion("BBB456", "Scania", 2015, 8000, true));
        vehiculos.add(new Auto("CCC789", "Toyota", 2020, 500, 4));

        VehiculoPrinter printer = new VehiculoPrinter();
        System.out.println("=== LISTADO DE VEHÍCULOS ===");
        for (Vehiculo v : vehiculos) {
            printer.imprimirInformacion(v);
        }
    }
}
