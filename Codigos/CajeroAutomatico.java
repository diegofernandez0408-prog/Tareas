import java.util.Scanner;

class CajeroAutomatico {
    Scanner scanner = new Scanner(System.in); {
         final double LIMITE_RETIRO = 5000;
         System.out.println(" Ingrese saldo disponible");
         double saldodisponible = scanner.nextDouble();

         System.out.println(" Ingrese la cantidad q desea retirar: ");
         double cantidadaretirar = scanner.nextDouble();

         if (cantidadaretirar <= 0) {
             System.out.println("Error: La cantidad a retirar debe ser mayor a cero. ");
         } else if (cantidadaretirar > LIMITE_RETIRO) {
             System.out.println("Error: La cantidad excede el limite de retiro permitido ($ " + LIMITE_RETIRO + ").");

         } else if (cantidadaretirar > saldodisponible) {
             System.out.println("Error: Saldo insuficiente. La cantidad supera el saldo disponible.");
         } else {

             double nuevoSaldo = saldodisponible - cantidadaretirar;

             System.out.println("\nRetiro autorizado, efectivo entregado y saldo restante.");
             System.out.println("Cantidad retirada: $" + cantidadaretirar);
             System.out.println("Nuevo saldo: $" + nuevoSaldo);

             if (nuevoSaldo < 500.0) {
                 System.out.println("¡Advertencia! Su saldo restante es menor a 500 pesos.");

             }
         }
     }
}
