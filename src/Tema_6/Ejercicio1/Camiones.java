package Tema_6.Ejercicio1;

/*Crea una clase vehículo con los atributos comunes a turismos, camiones y
ciclomotores. Para los turismos queremos saber el número de plazas y el tipo
de uso (profesional o particular). Para los camiones el peso máximo
autorizado y si la mercancía es peligrosa o no. Para ciclomotores la cilindrada
y si necesita carnet (a partir de 125 cc necesita carnet). Necesita carnet NO es
un atributo.*/
public class Camiones extends Vehiculo{
    private int pMaxAutorized = 100;
    private boolean mercancia;

    public Camiones(int pMaxAutorized, boolean mercancia ,int numPuertas, int ano, String color, String modelo, String marca){
        super(numPuertas, ano, color, modelo, marca);
        this.mercancia = mercancia;
        this.pMaxAutorized = pMaxAutorized;
    }

    public Camiones(){
        super();
        mercancia = true;

    }


    public void setMercancia(boolean mercancia) {
        this.mercancia = mercancia;
    }
    public boolean isMercancia() {
        return mercancia;
    }

    public void setPMaxAutorized(int pMaxAutorized) {
        this.pMaxAutorized = pMaxAutorized;
    }
    public int getPMaxAutorized() {
        return pMaxAutorized;
    }

    @Override
    public String toString() {
        String frase = "VEHICULO : CAMINONES \n";
        frase += super.toString();
        frase += "\nEl maximo peso autorizado es " + getPMaxAutorized();

        if (mercancia){
            frase += "\nLa mercancia es peligrosa.";
        }else {
            frase += "\nLa mercancia no es pelifrosa";
        }

        return frase;
    }
}
