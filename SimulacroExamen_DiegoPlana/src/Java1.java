import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        System.out.println("Elige que necesitas hacer:  (a) para Aprobados y suspendidos, (b) para billetes a Madrid y (c) para salir");

        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
        //case a
        int Fin = 0;
        double nota = 0;
        int contadorA = 0;
        int contadorS =0;

        //case b
        int edad = 0;
        int contadorP = 0;
        int personas = 0;
        double precioF = 0;
        double factura = 32;
        double descuento = 0;
        String nombre = "";


        switch (letra){
            case "a" :
                System.out.println("Has elegido la secuencia de notas");
                System.out.println("Ves diciendome las nostas, si pulsas 20 se acabara el programa");

                Fin = sc.nextInt();
                if (Fin >=0 && Fin<=10 || Fin == 20 ) {
                    while (Fin != 20) {
                        if (Fin >= 5) {
                            contadorA++;
                            Fin = sc.nextInt();
                        } else {
                            contadorS++;
                            Fin = sc.nextInt();
                        }
                    }
                }else {
                    System.out.println("Ese numero no es valido");
                }
                System.out.println("Hay " + contadorA + " aprobados y " + contadorS + " suspendidos.");
                break;

            case "b" :

                System.out.println("Para cuantas personas quereis el viaje");
                personas = sc.nextInt();
                sc.nextLine();

                while (personas != contadorP){
                    contadorP ++;

                    System.out.println("Cual es tu nombre?");
                    nombre = sc.nextLine();
                    System.out.println("Cuantos años tienes?");
                    edad = sc.nextInt();
                    sc.nextLine();

                    if (edad >= 65){
                        precioF = 32 * 10 / 100 ;
                        System.out.println(nombre + " que tiene "+ edad + "años" + " el descuento es de " + precioF + "€");

                        descuento = precioF + descuento;

                    } else if (edad >= 12 && edad <= 15) {
                        precioF = 32 * 8 / 100;
                        System.out.println(nombre + " que tiene "+ edad + "años" + " el descuento es de " + precioF + "€");

                        descuento = precioF + descuento;

                    } else if (edad >= 4 && edad <= 11) {
                        precioF = 32 * 35 / 100;
                        System.out.println(nombre + " que tiene "+ edad + "años" + " el descuento es de " + precioF + "€");

                        descuento = precioF + descuento;
                    } else if (edad >=0 && edad <=4) {
                        precioF = 32 * 100 / 100;
                        System.out.println(nombre + " que tiene "+ edad + "años" + " el descuento es de " + precioF + "€");

                        descuento = precioF + descuento;
                    } else if (edad < 0){
                        System.out.println("Es imposible tener menos de 0 años te resto uno en el contador porque doy por hecho que te has equivocado");
                        contadorP --;
                    }else {
                        precioF = 0;
                        descuento = precioF + descuento;

                        System.out.println(nombre + " que tiene "+ edad + "años" + " el descuento es de " + precioF + "€");
                    }

                }
                factura = factura * personas;
                factura = factura - descuento;

                System.out.println("El precio se te quedaria en " + factura );

                break;

            case "c" :
                System.out.println("PORGRAMA FINALIZADO.");

        }
    }
}
