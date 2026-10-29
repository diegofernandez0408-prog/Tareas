package Codigos;

import java.util.Scanner;

public class EstadisticasDeSecuenciaNumerica {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {


            System.out.println("Ingresa numero mayor a cero");
            int numero = scanner.nextInt();
            while (numero <= 0) {
                System.out.println("El numero debe de ser mayor a 0...");
                numero = scanner.nextInt();
            }
            int sumaDivicibles4 = 0, contadorMultiplos3 = 0, contador = 0;

            for (int i = 1; i < numero; i++) {
                if (i % 4 == 0) {
                    sumaDivicibles4 = sumaDivicibles4 + i;

                }
                if (i % 3 == 0) {
                    contadorMultiplos3 = contadorMultiplos3 + 1;

                }
                if (i % 4 == 0 && i % 3 == 0) {
                    contador++;
                }
            }
            System.out.println();
            System.out.println("===== TABLA =====");
            System.out.println("Suma de los numeros divisibles entre el 4:" + sumaDivicibles4);
            System.out.println("Numeros multiplos de 3:" + contadorMultiplos3);
            System.out.println("Numeros divisibles entre el 4 y 3:" + contador);


            System.out.println(" ===== Estadisticas ===== ");
            System.out.println("1. Numeros pares");
            System.out.println("2. Numeros impares");
            System.out.println("3. muntilos de 5");
            System.out.println("Elegir una opcion del 1 al 3");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("");
                    for (int i = 1; i < numero; i++) {
                        if (i % 2 == 0) ;
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (int i = 1; i < numero; i++) {
                        if (i % 2 != 0) ;
                        System.out.println(i);
                    }
                    break;
                case 3:
                    for (int i = 1; i < numero; i++) {
                        if (i % 5 == 0) ;
                        System.out.println(i);
                    }
                    break;

            }
            System.out.println("¿Desea hacer otro analisis? (seguir/Finalizar)" );
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("seguir"));

    }
}