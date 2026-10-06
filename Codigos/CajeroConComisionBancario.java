import java.util.Scanner;

  class CajeroConComisionBancario {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Constantes requeridas
            final double COMISION = 10.0;
            final double LIMITE_RETIRO = 5000.0;

            System.out.print("Ingrese el saldo disponible: ");
            double saldoDisponible = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que se desea retirar: ");
            double cantidadRetiro = scanner.nextDouble();

            if (cantidadRetiro > 0) {

                if (cantidadRetiro <= LIMITE_RETIRO) {

                    double totalRequerido = cantidadRetiro + COMISION;

                    if (saldoDisponible >= totalRequerido) {

                        double saldoFinal = saldoDisponible - totalRequerido;

                        System.out.println("\n--- RETIRO AUTORIZADO ---");
                        System.out.println("Monto retirado: $" + cantidadRetiro);
                        System.out.println("Comisión bancaria: $" + COMISION);
                        System.out.println("Total debitado: $" + totalRequerido);
                        System.out.println("Saldo final: $" + saldoFinal);

                    } else {
                        System.out.println("\nOperación no válida: No hay saldo suficiente para cubrir el retiro más la comisión de $" + COMISION + ".");
                    }


                } else {
                    System.out.println("\nOperación no válida: La cantidad supera el límite de retiro de $" + LIMITE_RETIRO + ".");
                }

            } else {
                System.out.println("\nOperación no válida: La cantidad a retirar debe ser mayor a cero.");
            }

        }
    }

