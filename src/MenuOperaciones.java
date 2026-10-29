import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Calcular cuadrado de un numero");
            System.out.println("2. Calcular cubo de un numero");
            System.out.println("3. Determinar si un numero es par o impar");
            System.out.println("4. Calcular la suma de los numeros de 1 hasta N");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    int num1 = -1;

                    while (num1 <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        num1 = scanner.nextInt();
                    }

                    System.out.println("El cuadrado de " + num1 +
                            " es: " + (num1 * num1));
                    break;

                case 2:

                    int num2 = -1;

                    while (num2 <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        num2 = scanner.nextInt();
                    }

                    System.out.println("El cubo de " + num2 +
                            " es: " + (num2 * num2 * num2));
                    break;

                case 3:

                    int num3 = -1;

                    while (num3 <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        num3 = scanner.nextInt();
                    }

                    if (num3 % 2 == 0) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }

                    break;

                case 4:

                    int n = -1;

                    while (n <= 0) {
                        System.out.print("Ingresa un numero positivo: ");
                        n = scanner.nextInt();
                    }

                    int suma = 0;

                    for (int i = 1; i <= n; i++) {
                        suma += i;
                    }

                    System.out.println("La suma de 1 hasta " + n +
                            " es: " + suma);

                    break;

                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("Error: opcion no valida.");
            }

        } while (opcion != 5);
    }
}