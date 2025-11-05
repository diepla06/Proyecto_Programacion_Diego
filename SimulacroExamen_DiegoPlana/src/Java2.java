import java.util.Objects;
import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {

        System.out.println("Dime la hora y el dia (primero las horas y luego los minutos) de las semana de España o Japón y yo te lo pasare al contrario");
        Scanner sc = new Scanner(System.in);
        System.out.println("Recordar que se tiene que escribir todo en minusculas y japón con acento");
        System.out.println("pulsa 25 para acabar el programa");

        String pais = "";
        String semana = "";
        int hora = 0;
        int min = 0;
        int acabar_programa = 0;



        do {
            System.out.println("Dime el Pais");
            pais = sc.nextLine();

            System.out.println("Dime el dia de la semana");
            semana = sc.nextLine();

            System.out.println("Dime las horas");
            hora = sc.nextInt();

            System.out.println("Dime los minutos");
            min = sc.nextInt();


            if (Objects.equals(pais, "españa")) {

                hora = hora + 8;

                if (hora > 24) {
                    if (Objects.equals(semana, "lunes")) {
                        hora = hora - 24;
                        semana = "martes";

                    } else if (Objects.equals(semana, "martes")) {
                        hora = hora - 24;
                        semana = "miercoles";

                    } else if (Objects.equals(semana, "miercoles")) {
                        hora = hora - 24;
                        semana = "jueves";

                    } else if (Objects.equals(semana, "jueves")) {
                        hora = hora - 24;
                        semana = "viernes";

                    } else if (Objects.equals(semana, "viernes")) {
                        hora = hora - 24;
                        semana = "sabado";

                    } else if (Objects.equals(semana, "sabado")) {
                        hora = hora - 24;
                        semana = "domingo";

                    } else if (Objects.equals(semana, "domingo")) {
                        hora = hora - 24;
                        semana = "lunes";

                    }
                    System.out.println("Japón " + semana + " " + hora + ":" + min);

                } else {
                    System.out.println("Japón " + semana + " " + hora + ":" + min);
                }

            } else if (Objects.equals(pais, "japón")) {

                hora = hora - 8;

                if (hora < 0) {
                    if (Objects.equals(semana, "lunes")) {
                        hora = hora + 24;
                        semana = "domingo";

                    } else if (Objects.equals(semana, "martes")) {
                        hora = hora + 24;
                        semana = "lunes";

                    } else if (Objects.equals(semana, "miercoles")) {
                        hora = hora + 24;
                        semana = "martes";

                    } else if (Objects.equals(semana, "jueves")) {
                        hora = hora + 24;
                        semana = "miercoles";

                    } else if (Objects.equals(semana, "viernes")) {
                        hora = hora + 24;
                        semana = "jueves";

                    } else if (Objects.equals(semana, "sabado")) {
                        hora = hora + 24;
                        semana = "viernes";

                    } else if (Objects.equals(semana, "domingo")) {
                        hora = hora + 24;
                        semana = "sabado";

                    }
                    System.out.println("España " + semana + " " + hora + ":" + min);

                } else {
                    System.out.println("España " + semana + " " + hora + ":" + min);
                }
            }
            System.out.println("Desea acabar el programa pulse 25 si no dale al 1");
            acabar_programa = sc.nextInt();
            sc.nextLine();
        }while (acabar_programa != 25);

        System.out.println("FINALIZANDO PROGRAMA");

    }
}
