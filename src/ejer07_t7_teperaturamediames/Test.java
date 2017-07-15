package ejer07_t7_teperaturamediames;

import java.util.Scanner;

/**
 *
 * @author IsmA
 */
public class Test {

    public static void menu(Dia arrayDia[], String nomDias[]) {

        int opcion;

        do {
            System.out.println("");
            System.out.println("Introduce 1 para rellenar las temperaturas:");
            System.out.println("Introduce 2 para mostrar las temperaturas:");
            System.out.println("Introduce 3 para mostrar la temperatura media:");
            System.out.println("Introduce 4 para ver las temperaturas más altas:");
            System.out.println("Introduce 5 para salir:");
            System.out.print("Opcion: ");

            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1: {
                    rellenarArray(arrayDia, nomDias);
                    break;
                }
                case 2: {
                    mostrarArray(arrayDia);
                    break;
                }
                case 3: {

                    System.out.println("\nLa temperadura media es " + temperaturaMedia(arrayDia) + " grados.");
                    break;
                }
                case 4: {
                    mayorTemperatura(arrayDia);
                    break;
                }
                case 5: {

                    break;
                }

            }

        } while (opcion != 5);
        System.out.println("¡Saludos!");

    }

    public static void rellenarArray(Dia arrayDia[], String nomDias[]) {

        int contador = (int) Math.floor((Math.random() * 6));;

        for (int i = 0; i < arrayDia.length; i++) {

            arrayDia[i] = new Dia(nomDias[contador], gradoAleatorio());
            if (contador == 6) {
                contador = 0;
            } else {
                contador++;
            }
        }

        System.out.println("\nEl mes ha sido rellenado con temperaturas");

    }

    public static void mostrarArray(Dia arrayDia[]) {
        System.out.println("");

        for (int i = 0; i < arrayDia.length; i++) {

            System.out.println(arrayDia[i].getNombreDia() + " dia " + i + " : " + arrayDia[i].getTemperatura() + " grados");
        }

        System.out.println("");
    }

    public static String diaAleatorio() {

        String nombre;

        nombre = "nombreDelDia";

        return nombre;
    }

    public static int gradoAleatorio() {

        int grado;

        grado = (int) Math.floor((Math.random() * 50) - 5);

        return grado;
    }

    public static float temperaturaMedia(Dia arrayDia[]) {

        float media = 0;

        for (int i = 0; i < arrayDia.length; i++) {

            media = media + arrayDia[i].getTemperatura();
        }

        return media / 30;

    }

    public static void mayorTemperatura(Dia arrayDia[]) {

        int temperaturaMax = arrayDia[0].getTemperatura();

        for (int i = 0; i < arrayDia.length; i++) {

            if ((arrayDia[i].getTemperatura() > temperaturaMax)) {

                temperaturaMax = arrayDia[i].getTemperatura();

            }

        }
        System.out.println("\nEl día o dias más calurosos fueron: ");
        for (int j = 0; j < arrayDia.length; j++) {
            if (arrayDia[j].getTemperatura() == temperaturaMax) {
                System.out.println("El " + arrayDia[j].getNombreDia() + " dia " + j + " con una temperatura de " + arrayDia[j].getTemperatura() + " grados.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Bienvenido al medidor de temperaturas medias.");

        Dia[] arrayDia = new Dia[30];
        String[] nomDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        menu(arrayDia, nomDias);

    }

}
