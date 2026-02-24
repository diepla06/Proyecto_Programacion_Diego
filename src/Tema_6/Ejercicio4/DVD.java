package Tema_6.Ejercicio4;

public class DVD extends Ficha {
    private String director;
    private int anio;
    private String tipo;

    public DVD() { super(); }

    public DVD(int numero, String titulo, String director, int anio, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public void mostrarDetalles() {
        System.out.println("DVD #" + getNumero() + " - " + getTitulo() +
                " | Director: " + director + " | Género: " + tipo);
    }
}