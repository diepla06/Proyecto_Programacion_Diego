package Tema_4.Ejercicio3_2;

public class Persona {

    private String dni;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public int getContadorCuentas() {
        return contadorCuentas;
    }
    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
    }

    public Persona() {
        this.dni = "20927444C";
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    public Persona(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

     public void aniadirCuenta(Cuenta nuevaCuenta) {
        if (contadorCuentas < 3) {

            this.cuentas[contadorCuentas] = nuevaCuenta;

            contadorCuentas++;
            System.out.println("Cuenta añadida a la persona con DNI: " + this.dni);
        } else {
            System.out.println("Error: No se pueden añadir más de 3 cuentas.");
        }
    }


    public boolean esMorosa() {

        for (int i = 0; i < contadorCuentas; i++) {
            if (this.cuentas[i].consultarSaldo() < 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String info = "Cliente: " + dni + "\n";
        for(int i=0; i<contadorCuentas; i++){
            info += cuentas[i].toString() + "\n";
        }
        return info;
    }


}
