package Tema_7.Funkos;

import java.io.Serializable;

public class Funko implements Serializable {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private String fecha;

    public Funko(String cod, String nombre, String modelo, double precio, String fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getNombre() { return nombre; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
    public String getFecha() { return fecha; }

    @Override
    public String toString() {
        return String.format("ID: %s | %-20s | %-10s | %6.2f€ | %s",
                cod.substring(0,5), nombre, modelo, precio, fecha);
    }

    public String toCSV() {
        return cod + "," + nombre + "," + modelo + "," + precio + "," + fecha;
    }
}