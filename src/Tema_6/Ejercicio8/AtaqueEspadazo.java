package Tema_6.Ejercicio8;

public class AtaqueEspadazo implements IAtaqueAvanzado {
    private String tipoEspada;
    private double danyoFisico;
    private double esfuerzoFisicoCoste;

    public AtaqueEspadazo() {}

    public AtaqueEspadazo(String tipoEspada, double danyoFisico, double esfuerzoFisicoCoste) {
        this.tipoEspada = tipoEspada;
        this.danyoFisico = danyoFisico;
        this.esfuerzoFisicoCoste = esfuerzoFisicoCoste;
    }

    // Getters y Setters
    public String getTipoEspada() { return tipoEspada; }
    public void setTipoEspada(String tipoEspada) { this.tipoEspada = tipoEspada; }
    public double getDanyoFisico() { return danyoFisico; }
    public void setDanyoFisico(double danyoFisico) { this.danyoFisico = danyoFisico; }
    public double getEsfuerzoFisicoCoste() { return esfuerzoFisicoCoste; }
    public void setEsfuerzoFisicoCoste(double esfuerzoFisicoCoste) { this.esfuerzoFisicoCoste = esfuerzoFisicoCoste; }

    @Override
    public void lanzar() { System.out.println("¡Espadazo con " + tipoEspada + "!"); }

    @Override
    public void mostrarCoste() {
        System.out.println("Coste -> Mana: 0 | Esfuerzo Fisico: " + esfuerzoFisicoCoste);
    }

    @Override
    public void mostrarDanyoInfligido() {
        System.out.println("Danyo -> Magico: 0 | Fisico: " + danyoFisico);
    }
}
