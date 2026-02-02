package Tema_4.Ejercicio3_2;


    public class Cuenta {

        private String numeroCuenta;
        private double saldo;



        public Cuenta(){
        this.numeroCuenta = "ES21 4568 4568 4684 4568 2547";
        this.saldo = 999999;
        }
        public Cuenta(String numeroCuenta, double saldoInicial) {
            this.numeroCuenta = numeroCuenta;

            if (saldoInicial < 0) {
                this.saldo = 0;
                System.out.println("Saldo inicial no válido. Se ha establecido en 0.");
            } else {
                this.saldo = saldoInicial;
            }
        }

        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }
        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public double getSaldo() {
            return saldo;
        }

        public double consultarSaldo() {
            return this.saldo;
        }


        public void abonar(double cantidad) {
            if (cantidad > 0) {
                this.saldo += cantidad;
                System.out.println("Abono realizado con éxito. Nuevo saldo: " + this.saldo);
            } else {
                System.out.println("Error: La cantidad a abonar debe ser positiva.");
            }
        }

        public void pagarRecibo(double cantidad) {
            if (cantidad <= 0) {
                System.out.println("Error: La cantidad a pagar debe ser positiva.");
            } else if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
                System.out.println("Recibo pagado con éxito. Nuevo saldo: " + this.saldo);
            } else {
                System.out.println("Error: Saldo insuficiente para pagar el recibo.");
            }
        }


        @Override
        public String toString() {
            return "Cuenta Nº: " + numeroCuenta + " | Saldo: " + saldo;
        }
    }

