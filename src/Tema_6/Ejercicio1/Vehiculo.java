package Tema_6.Ejercicio1;

/*Crea una clase vehículo con los atributos comunes a turismos, camiones y
ciclomotores. Para los turismos queremos saber el número de plazas y el tipo
de uso (profesional o particular). Para los camiones el peso máximo
autorizado y si la mercancía es peligrosa o no. Para ciclomotores la cilindrada
y si necesita carnet (a partir de 125 cc necesita carnet). Necesita carnet NO es
un atributo.*/

public abstract class Vehiculo {

    private int numPuertas;
    private int ano;
    private String color;
    private String modelo;
    private String marca;

    public Vehiculo(int numPuertas, int ano, String color, String modelo, String marca){
        this.numPuertas = numPuertas;
        this.ano = ano;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }
    public Vehiculo(){
        numPuertas = 5;
        ano = 2008;
        color = "rosa";
        modelo = "Reventon";
        marca = "Lamborghini";
    }

    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString() {
        String frase = "Tiene: " + getNumPuertas() + " puertas. \nEs de el año " + getAno() + "\nEs de color " + getColor() +"\nEs un " + getModelo() + " de la marca " + getMarca();
        return frase;
    }
}
