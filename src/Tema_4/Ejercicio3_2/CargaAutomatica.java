package Tema_4.Ejercicio3_2;

public class CargaAutomatica {
    public static void main(String[] args) {




        System.out.println("=== INICIO DE LA PRUEBA AUTOMÁTICA ===");


        //array de 10 personas
        //menu
        //falta recibir transferencia


        System.out.println("1. Creando clientes...");
        Persona p1 = new Persona("11111111A"); //Cliente
        Persona p2 = new Persona("22222222B"); //MOROSO
        System.out.println("Clientes creados: " + p1.getDni() + " y " + p2.getDni() + "\n");

        System.out.println("2. Creando cuentas bancarias... \n");
        Cuenta c1 = new Cuenta("ES01-100", 1000);
        Cuenta c2 = new Cuenta("ES01-200", 500);
        Cuenta c3 = new Cuenta("ES01-300", 0);


        System.out.println("3. Asociando cuentas a clientes...");
        p1.aniadirCuenta(c1); //Persona 1 / 1000€
        p2.aniadirCuenta(c2); //Persona 2 / 500€
        p2.aniadirCuenta(c3); //Persona 3 / 0€

        //Como estan las cuentas
        System.out.println("   [Estado Persona 1] " + p1.esMorosa());
        System.out.println("   [Estado Persona 2] " + p2.esMorosa() + "\n");


        System.out.println("4. Realizando operaciones...");

        //La persona 1 cobra la nomina
        System.out.println("   -> P1 recibe nómina de 2000€");
        c1.abonar(2000);

        //Persona 2 se vuelve moroso, paga mas de lo que tiene
        System.out.println("   -> P2 intenta pagar recibo de 600€ en cuenta de 500€");
        c2.pagarRecibo(600);

        //Comprobación
        System.out.println("\n5. RESULTADOS FINALES:");

        System.out.println("--- CLIENTE 1 (" + p1.getDni() + ") ---");
        System.out.println(p1);
        System.out.println("¿Es MOROSO?: " + (p1.esMorosa() ? "SÍ" : "NO"));

        System.out.println("\n--- CLIENTE 2 (" + p2.getDni() + ") ---");
        System.out.println(p2);
        System.out.println("¿Es MOROSO?: " + (p2.esMorosa() ? "SÍ (Tiene deudas)" : "NO"));


    }
}
