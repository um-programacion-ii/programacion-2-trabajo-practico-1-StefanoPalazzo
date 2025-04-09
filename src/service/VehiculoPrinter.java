package src.service;
import src.Vehiculo;
import src.Camion;

public class VehiculoPrinter {

    public void imprimirInformacion(Vehiculo vehiculo) {
        System.out.println("Vehículo:");
        System.out.println("  Patente: " + vehiculo.getPatente());
        System.out.println("  Marca: " + vehiculo.getMarca());
        System.out.println("  Año: " + vehiculo.getAnio());
        System.out.println("  Capacidad de Carga: " + vehiculo.getCapacidadCargaKg() + " kg");

        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("  Tiene acoplado: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }
    }
}
