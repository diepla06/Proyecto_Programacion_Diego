package Tema_4.Ejercicio3_2;

public class Cuenta {
    private String numeroCuenta;
    private int saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cuenta(){
        this.numeroCuenta = "ES1234567891011121314151" ;
        this.saldo = 0;
    }

    public Cuenta(String numeroCuenta, int saldoInicial) {
        this.numeroCuenta = numeroCuenta;

        if (saldoInicial < 0) {
            this.saldo = 0;
            System.out.println("Saldo inicial no válido. Se ha establecido en 0.");
        } else {
            this.saldo = saldoInicial;
        }
    }

    public int consultarSaldo() {
        return this.saldo;
    }

    public void abonar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Abono realizado con éxito. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: La cantidad a abonar debe ser superior a 0.");
        }
    }
    public void pagarRecibo(double cantidad) {
        this.saldo -= cantidad;
        System.out.println("Pago de " + cantidad + " realizado. Saldo actual: " + this.saldo);
    }
    public String toString() {
        return "Cuenta Nº: " + numeroCuenta + " | Saldo: " + saldo;
    }


}
