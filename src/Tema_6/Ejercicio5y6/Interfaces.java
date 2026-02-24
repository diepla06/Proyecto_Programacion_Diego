package Tema_6.Ejercicio5y6;

public interface Interfaces {
    void publicar();

    void compartir();

    //TODOS
    interface IPublicacion {
        void publicar();
        void compartir();
    }

    //fotos y videos
    interface IAbrirPublicacion {
        void abrir();
    }
    //Ejercicio6
    interface IPublicacionConReaccion extends Interfaces.IPublicacion {
        void comentar(String texto);
        void compartir();
    }
}
