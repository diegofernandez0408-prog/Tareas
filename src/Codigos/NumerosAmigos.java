package Codigos;

import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            int num1 = -1;
            int num2 = -1;
            while (num1 <= 0) {
                System.out.println("Ingresa el primer numero:");
                num1 = scanner.nextInt();
            }
            while (num2 <= 0) {
                System.out.println("Ingresa el segundo numero:");
                num2 = scanner.nextInt();
            }
            int sumaDiv1 = 0;
            int sumaDiv2 = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDiv1 += i;
                }
            }
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumaDiv2 += i;
                }
            }
            System.out.println("------ MENU ------");
            System.out.println("1. Mostrar suma de divisores");
            System.out.println("2. Mostrar solo resultado");
            System.out.println("Selecciona una opcion:");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Suma de divisores de " + num1 + ": " + sumaDiv1);
                    System.out.println("Suma de divisores de " + num2 + ": " + sumaDiv2);
                    if (sumaDiv1 == num2 && sumaDiv2 == num1) {
                        System.out.println("Los numeros son amigos.");
                    } else {
                        System.out.println("Los numeros no son amigos.");
                    }
                    break;
                case 2:
                    if (sumaDiv1 == num2 && sumaDiv2 == num1) {
                        System.out.println("Los numeros son amigos.");
                    } else {
                        System.out.println("Los numeros no son amigos.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println("¿Desea analizar otros numeros? (S/N)");
            opcion = scanner.next().charAt(0);

        } while (opcion == 'S');

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
