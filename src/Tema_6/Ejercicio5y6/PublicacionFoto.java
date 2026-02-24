package Tema_6.Ejercicio5y6;

public class PublicacionFoto implements Interfaces.IAbrirPublicacion, Interfaces.IPublicacionConReaccion {
    private String filtro;
    private String rutaArchivo;

    public PublicacionFoto() {}

    public PublicacionFoto(String filtro, String rutaArchivo) {
        this.filtro = filtro;
        this.rutaArchivo = rutaArchivo;
    }

    public String getFiltro() { return filtro; }
    public void setFiltro(String filtro) { this.filtro = filtro; }
    public String getRutaArchivo() { return rutaArchivo; }
    public void setRutaArchivo(String rutaArchivo) { this.rutaArchivo = rutaArchivo; }

    @Override
    public void publicar() {
        System.out.println("Publicando foto con filtro " + filtro);
    }

    public void comentar(String comentario) { System.out.println("Comentario en foto: " + comentario); }

    @Override
    public void compartir() {
        System.out.println("Compartiendo foto...");
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo archivo: " + rutaArchivo);
    }
}
