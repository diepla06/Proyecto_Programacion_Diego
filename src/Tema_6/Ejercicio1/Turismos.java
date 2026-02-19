package Tema_6.Ejercicio1;
/*Crea una clase vehículo con los atributos comunes a turismos, camiones y
ciclomotores. Para los turismos queremos saber el número de plazas y el tipo
de uso (profesional o particular). Para los camiones el peso máximo
autorizado y si la mercancía es peligrosa o no. Para ciclomotores la cilindrada
y si necesita carnet (a partir de 125 cc necesita carnet). Necesita carnet NO es
un atributo.*/
public class Turismos extends Vehiculo{
    private int numPlazas;
    private boolean tipoUso;

    public Turismos(int numPlazas, boolean tipoUso, int numPuertas, int ano, String color, String modelo, String marca){
        super(numPuertas, ano, color, modelo, marca);
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }

    public Turismos(){
        super();
        numPlazas = 2;
        tipoUso = true;
    }


    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }


    public boolean getTipoUso() {
        return true;
    }

    public void setTipoUso() {
            this.tipoUso = tipoUso;
    }

    @Override
    public String toString() {

        String frase = "VEHICULO : COCHE \n";
        frase += super.toString();
        frase += "\nTiene " + getNumPuertas();
        if (tipoUso){
            frase += "\nEl coche es para uso profesional.";
        }else {
            frase += "\nEl coche es para uso personal.";
        }

        return frase;
    }
}
