package src;

import src.Vehiculo;
import src.service.VehiculoPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        Vehiculo vehiculo = new Vehiculo("AAA123", "Toyota", 2010, 1000);
        Camion camion = new Camion("CAM456", "Volvo", 2015, 5000, true);
        Auto auto = new Auto("AUTO789", "Ford", 2022, 350, 4);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo);
        vehiculos.add(camion);
        vehiculos.add(auto);

        for (Vehiculo v : vehiculos) {
            printer.imprimirInformacion(v);
            System.out.println("------------");
        }
    }
}