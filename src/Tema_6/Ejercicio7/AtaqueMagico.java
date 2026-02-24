package Tema_6.Ejercicio7;

public class AtaqueMagico implements IAtaque {
    private String hechizo;
    private double danyoMagico;
    private double manaNecesario;

    public AtaqueMagico() {}

    public AtaqueMagico(String hechizo, double danyoMagico, double manaNecesario) {
        this.hechizo = hechizo;
        this.danyoMagico = danyoMagico;
        this.manaNecesario = manaNecesario;
    }

    public String getHechizo() { return hechizo; }
    public void setHechizo(String hechizo) { this.hechizo = hechizo; }

    public double getDanyoMagico() { return danyoMagico; }
    public void setDanyoMagico(double danyoMagico) { this.danyoMagico = danyoMagico; }

    public double getManaNecesario() { return manaNecesario; }
    public void setManaNecesario(double manaNecesario) { this.manaNecesario = manaNecesario; }

    @Override
    public void lanzar() {
        System.out.println("Lanzando hechizo: " + hechizo);
    }

    @Override
    public double coste() {
        return manaNecesario;
    }

    @Override
    public double danyoInfligido() {
        return danyoMagico;
    }
}
