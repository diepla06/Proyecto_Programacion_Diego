package Tema_6.Ejercicio5y6;

public class PublicacionVideo implements Interfaces.IPublicacionConReaccion, Interfaces.IAbrirPublicacion {
    private int duracion;
    private String formato;

    public PublicacionVideo() {}

    public PublicacionVideo(int duracion, String formato) {
        this.duracion = duracion;
        this.formato = formato;
    }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public void publicar() {
        System.out.println("Subiendo video de " + duracion + " segundos en " + formato);
    }

    public void comentar(String comentario) { System.out.println("Comentario en foto: " + comentario); }

    @Override
    public void compartir() {
        System.out.println("Compartiendo video...");
    }

    @Override
    public void abrir() {
        System.out.println("Reproduciendo video...");
    }
}
