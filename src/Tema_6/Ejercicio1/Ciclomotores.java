package Tema_6.Ejercicio1;
/*Crea una clase vehículo con los atributos comunes a turismos, camiones y
ciclomotores. Para los turismos queremos saber el número de plazas y el tipo
de uso (profesional o particular). Para los camiones el peso máximo
autorizado y si la mercancía es peligrosa o no. Para ciclomotores la cilindrada
y si necesita carnet (a partir de 125 cc necesita carnet). Necesita carnet NO es
un atributo.*/
public class Ciclomotores extends Vehiculo{
    private int cilinadrada;

    public Ciclomotores(int cilinadrada,int numPuertas, int ano, String color, String modelo, String marca){
        super(numPuertas, ano, color, modelo, marca);
        this.cilinadrada = cilinadrada;
    }
    public Ciclomotores(){
        super();
        cilinadrada = 125;
    }

    public int getCilinadrada() {
        return cilinadrada;
    }

    public void setCilinadrada(int cilinadrada) {
        this.cilinadrada = cilinadrada;
    }

    @Override
    public String toString() {
        String frase = "VEHICULO : CIVLOMOTORES \n";
        frase += super.toString();

        if(cilinadrada >= 125){
            frase += "\nLa cilindrada es de " + this.cilinadrada + " y si que necesita carnet.";
        }else {
            frase += "\nLa cilindrada es de " + this.cilinadrada + " y no necesita carnet.";
        }

        return frase;
    }
}
