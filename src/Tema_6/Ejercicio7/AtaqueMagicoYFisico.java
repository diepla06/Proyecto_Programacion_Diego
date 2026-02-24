package Tema_6.Ejercicio7;

public class AtaqueMagicoYFisico implements IAtaque {
    private String nombreHibrido;
    private double danyoTotal;
    private double costeCombinado;

    public AtaqueMagicoYFisico() {}

    public AtaqueMagicoYFisico(String nombre, double danyo, double coste) {
        this.nombreHibrido = nombre;
        this.danyoTotal = danyo;
        this.costeCombinado = coste;
    }

    public String getNombreHibrido() { return nombreHibrido; }
    public void setNombreHibrido(String n) { this.nombreHibrido = n; }

    public double getDanyoTotal() { return danyoTotal; }
    public void setDanyoTotal(double d) { this.danyoTotal = d; }

    public double getCosteCombinado() { return costeCombinado; }
    public void setCosteCombinado(double c) { this.costeCombinado = c; }

    @Override
    public void lanzar() {
        System.out.println("Realizando ataque mixto: " + nombreHibrido);
    }

    @Override
    public double coste() {
        return costeCombinado;
    }

    @Override
    public double danyoInfligido() {
        return danyoTotal;
    }
}
