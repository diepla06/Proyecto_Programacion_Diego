package Tema_6.Ejercicio4;

public abstract class Ficha {
    private int numero;
    private String titulo;

    public Ficha() {
    }

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public abstract void mostrarDetalles();
}
