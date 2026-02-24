package Tema_6.Ejercicio5y6;

public class PublicacionTexto implements Interfaces.IPublicacionConReaccion {
    private String texto;
    private String comentario;


    public PublicacionTexto() {}

    public PublicacionTexto(String texto, String comentario) {
        this.texto = texto;
        this.comentario = comentario;
    }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    @Override
    public void publicar() {
        System.out.println("Publicando texto: " + texto);
    }

    @Override
    public void comentar(String comentario) { System.out.println("Comentario en foto: " + comentario); }

    @Override
    public void compartir() {
        System.out.println("Compartiendo texto...");
    }
}
