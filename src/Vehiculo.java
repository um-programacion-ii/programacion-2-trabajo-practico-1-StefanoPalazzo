package src;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private int capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, int capacidadCargaKg) {
        if (patente == null || patente.isEmpty()) throw new IllegalArgumentException("Patente inválida");
        if (anio < 1900 || anio > java.time.Year.now().getValue()) throw new IllegalArgumentException("Año inválido");
        if (capacidadCargaKg < 0) throw new IllegalArgumentException("Capacidad de carga inválida");

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public int getCapacidadCargaKg() { return capacidadCargaKg; }
    public void setCapacidadCargaKg(int capacidadCargaKg) { this.capacidadCargaKg = capacidadCargaKg; }
}
