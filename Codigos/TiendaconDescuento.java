import java.util.Scanner;

public class TiendaconDescuento {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            final double DESC_NORMAL = 0.0;
            final double DESC_FRECUENTE = 0.10;
            final double DESC_VIP = 0.20;
            final double DESC_ADICIONAL = 0.05;
            final double MONTO_MINIMO_ADICIONAL = 2000.0;

            System.out.print(" Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print(" Ingrese el monto de la compra: ");
            double montoOriginal = scanner.nextDouble();

            System.out.println(" Seleccione el tipo de cliente: ");
            System.out.println( "1. Normal ");
            System.out.println(" 2. Frecuente ");
            System.out.println(" 3. VIP ");
            int Cliente = scanner.nextInt();

            double porcentajeBase = 0.0;
            String tipoStr = "";

            switch (Cliente) {
                case 1:
                    porcentajeBase = DESC_NORMAL;
                    tipoStr = " Normal ";
                    break;
                case 2:
                    porcentajeBase = DESC_FRECUENTE;
                    tipoStr = " Frecuente ";
                    break;
                case 3:
                    porcentajeBase = DESC_VIP;
                    tipoStr = " VIP ";
                    break;
                default:
                    System.out.println(" Tipo de cliente no válido. Se aplicará tipo Normal por defecto ");
                    porcentajeBase = DESC_NORMAL;
                    tipoStr = "Normal";
                    break;
            }

            double descuentoBaseMonto = montoOriginal * porcentajeBase;
            double descuentoAdicionalMonto = 0.0;

            if (montoOriginal > MONTO_MINIMO_ADICIONAL) {
                descuentoAdicionalMonto = montoOriginal * DESC_ADICIONAL;
            }

            double totalDescuentos = descuentoBaseMonto + descuentoAdicionalMonto;
            double totalPagar = montoOriginal - totalDescuentos;

            System.out.println("\n--- RESUMEN DE COMPRA ---");
            System.out.println("Cliente: " + nombre + " (" + tipoStr + ")");
            System.out.println("Monto original: $" + montoOriginal);
            System.out.println("Descuento por tipo de cliente: $" + descuentoBaseMonto);
            System.out.println("Descuento adicional (5% por compra > $2000): $" + descuentoAdicionalMonto);
            System.out.println("Total de descuentos aplicados: $" + totalDescuentos);
            System.out.println("Total a pagar: $" + totalPagar);


        }


}
