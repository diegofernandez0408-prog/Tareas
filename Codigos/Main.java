
void main() {
    class CajeroAutomatico {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final double LIMITE_RETIRO = 5000.0;
            System.out.print("Ingrese el saldo disponible: ");
            double saldoDisponible = scanner.nextDouble();
            System.out.print("Ingrese la cantidad que desea retirar: ");
            double cantidadRetiro = scanner.nextDouble();

            if (cantidadRetiro <= 0) {
                System.out.println("Error: La cantidad a retirar debe ser mayor a cero.");
            } else if (cantidadRetiro > LIMITE_RETIRO) {
                System.out.println("Error: La cantidad excede el límite de retiro permitido ($" + LIMITE_RETIRO + ").");
            } else if (cantidadRetiro > saldoDisponible) {
                System.out.println("Error: Saldo insuficiente. La cantidad supera el saldo disponible.");
            } else {
                double nuevoSaldo = saldoDisponible - cantidadRetiro;
                System.out.println("\nRetiro autorizado, efectivo entregado y saldo restante.");
                System.out.println("Cantidad retirada: $" + cantidadRetiro);
                System.out.println("Nuevo saldo: $" + nuevoSaldo);

                if (nuevoSaldo < 500.0) {
                    System.out.println("¡Advertencia! Su saldo restante es menor a 500 pesos.");
                }
            }

            scanner.close();
        }
    }
}
