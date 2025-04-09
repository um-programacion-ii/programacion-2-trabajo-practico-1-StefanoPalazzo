package src.service;
import src.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscarPorPatente{
    public void buscarVehiculo(ArrayList<Vehiculo> vehiculos) {
        Scanner lectura = new Scanner (System.in);
        VehiculoPrinter printer = new VehiculoPrinter();
        System.out.println("Ingrese una patente: ");
        String patente = lectura.nextLine();
        boolean vehiculoEncontrado = false;
        for (Vehiculo v : vehiculos) {
            if (patente.toUpperCase().equals(v.getPatente())) {
                System.out.println("Vehículo encontrado!");
                printer.imprimirInformacion(v);
                vehiculoEncontrado = true;
                break;
            }
        }
        if (!vehiculoEncontrado) {
            System.out.println("No se encontró ningún vehículo con esa patente.");
        }

        lectura.close();
    }
}
