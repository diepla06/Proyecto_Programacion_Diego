package Tema_6.Ejercicio4;

public class Libro extends Ficha {
    private String autor;
    private String editorial;

    public Libro() { super(); }
    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }


    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    @Override
    public void mostrarDetalles() {
        System.out.println("LIBRO #" + getNumero() + " - " + getTitulo() +
                " | Autor: " + autor + " | Editorial: " + editorial);
    }
}
