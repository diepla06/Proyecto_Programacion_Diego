package Tema_7.Ejercicio.B2;

class Alumno {
    String nombreCompleto;
    double notaMedia;

    // Constructor
    public Alumno(String nombreCompleto, double notaMedia) {
        this.nombreCompleto = nombreCompleto;
        this.notaMedia = notaMedia;
    }

    // Setters y getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {}

    public double getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(double notaMedia) {}

    @Override
    public String toString() {
        return "Alumno: " + nombreCompleto + "  Nota Media: " + notaMedia;
    }
}

