package Codigos;

import java.util.Scanner;

public class PracUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DESCUENTO_ADULTO_MAYOR = 0.15;
        int op = 0;
        int NIÑO = 0, ADOLECENTE = 0, ADULTO = 0, ADULTO_MAYOR = 0;
        double totalR = 0, DescuentosTotales = 0;
        int totalPacientes = 0;


        do {
            System.out.println("===== Menú =====");
            System.out.println("1) Registrar paciente");
            System.out.println("2) Mostrar resumen");
            System.out.println("3) Finalizar");
            System.out.print("Elige una opción: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Edad del paciente: ");
                    int edad = scanner.nextInt();
                    System.out.print("Costo de la consulta: ");
                    double costo = scanner.nextDouble();

                    double descuento = 0;
                    if (edad < 12) {
                        NIÑO++;
                    } else if (edad <= 17) {
                        ADOLECENTE++;
                    } else if (edad <= 59) {
                        ADULTO++;
                    } else {
                        ADULTO_MAYOR++;
                        descuento = costo * DESCUENTO_ADULTO_MAYOR;
                    }

                    double total = costo - descuento;
                    totalPacientes++;
                    totalR += total;
                    DescuentosTotales += descuento;
                    System.out.println("Edad:" +edad);
                    System.out.println("Descuento aplicado: $" + descuento);
                    System.out.println("Total a pagar: $" + total);
                    break;

                case 2:
                    if (totalPacientes == 0) {
                        System.out.println("No hay pacientes registrados aún.");
                    } else {
                        System.out.println("\n===== RESUMEN =====");
                        System.out.println("Total de pacientes: " + totalPacientes);
                        System.out.println("Niños: " + NIÑO);
                        System.out.println("Adolescentes: " + ADOLECENTE);
                        System.out.println("Adultos: " + ADULTO);
                        System.out.println("Adultos mayores: " + ADULTO_MAYOR);
                        System.out.println("Total recaudado: $" + totalR);
                        System.out.println("Total descuentos aplicados: $" + DescuentosTotales);
                        System.out.println("Promedio pagado por paciente: $" + totalR / totalPacientes);
                    }
                    break;

                case 3:
                    System.out.println("Finalizo el Programa");
                    break;

                default:
                    System.out.println("Opción invalida, intenta de nuevo.");
            }

        } while (op != 3);
    }
}
