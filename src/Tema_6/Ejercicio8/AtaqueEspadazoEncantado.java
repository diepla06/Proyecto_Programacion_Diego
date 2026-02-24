package Tema_6.Ejercicio8;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado {
    private double danyoFisico;
    private double danyoMagico;
    private double manaCoste;
    private double esfuerzoFisicoCoste;

    public AtaqueEspadazoEncantado() {}

    public AtaqueEspadazoEncantado(double dFisico, double dMagico, double cMana, double cEsfuerzo) {
        this.danyoFisico = dFisico;
        this.danyoMagico = dMagico;
        this.manaCoste = cMana;
        this.esfuerzoFisicoCoste = cEsfuerzo;
    }

    // Getters y Setters
    public double getDanyoFisico() { return danyoFisico; }
    public void setDanyoFisico(double dFisico) { this.danyoFisico = dFisico; }
    public double getDanyoMagico() { return danyoMagico; }
    public void setDanyoMagico(double dMagico) { this.danyoMagico = dMagico; }
    public double getManaCoste() { return manaCoste; }
    public void setManaCoste(double mana) { this.manaCoste = mana; }
    public double getEsfuerzoFisicoCoste() { return esfuerzoFisicoCoste; }
    public void setEsfuerzoFisicoCoste(double esfuerzo) { this.esfuerzoFisicoCoste = esfuerzo; }

    @Override
    public void lanzar() { System.out.println("¡Impacto de Espadazo Encantado!"); }

    @Override
    public void mostrarCoste() {
        System.out.println("Coste -> Mana: " + manaCoste + " | Esfuerzo Fisico: " + esfuerzoFisicoCoste);
    }

    @Override
    public void mostrarDanyoInfligido() {
        System.out.println("Danyo -> Magico: " + danyoMagico + " | Fisico: " + danyoFisico);
    }
}
