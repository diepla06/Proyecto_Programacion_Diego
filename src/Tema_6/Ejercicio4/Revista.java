package Tema_6.Ejercicio4;

public class Revista extends Ficha {
    private int numeroPublicacion;
    private int anio;

    public Revista() { super(); }

    public Revista(int numero, String titulo, int nPub, int anio) {
        super(numero, titulo);
        this.numeroPublicacion = nPub;
        this.anio = anio;
    }

    public int getNumeroPublicacion() { return numeroPublicacion; }
    public void setNumeroPublicacion(int nPub) { this.numeroPublicacion = nPub; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    @Override
    public void mostrarDetalles() {
        System.out.println("REVISTA #" + getNumero() + " - " + getTitulo() +
                " | Edición: " + numeroPublicacion + " | Año: " + anio);
    }
}
