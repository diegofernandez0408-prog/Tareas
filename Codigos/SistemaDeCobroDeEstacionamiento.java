import java.util.Scanner;

  public class SistemaDeCobroDeEstacionamiento {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final double TARIFA_MOTO = 10.0;
            final double TARIFA_AUTO = 20.0;
            final double TARIFA_CAMIONETA = 30.0;

            final double DESC_5_HORAS = 0.10; // 10%
            final double DESC_10_HORAS = 0.20; // 20%

            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1.- Motocicleta");
            System.out.println("2.- Automóvil");
            System.out.println("3.- Camioneta");
            int TipodelVehiculo = scanner.nextInt();

            System.out.print("Ingrese el número de horas que permaneció en el estacionamiento: ");
            int horas = scanner.nextInt();

            if (horas <= 0) {
                System.out.println("\nError: La cantidad de horas no es válida (debe ser mayor a cero).");
            } else {
                double tarifaHora = 0.0;
                String nombredelVehiculo = "";

                switch (TipodelVehiculo) {
                    case 1:
                        tarifaHora = TARIFA_MOTO;
                        nombredelVehiculo = "Motocicleta";
                        break;
                    case 2:
                        tarifaHora = TARIFA_AUTO;
                        nombredelVehiculo = "Automóvil";
                        break;
                    case 3:
                        tarifaHora = TARIFA_CAMIONETA;
                        nombredelVehiculo = "Camioneta";
                        break;
                    default:
                        System.out.println("\nTipo de vehículo no válido. Se calculará usando la tarifa de Automóvil por defecto.");
                        tarifaHora = TARIFA_AUTO;
                        nombredelVehiculo = "Automóvil (Por defecto)";
                        break;
                }

                double subtotal = horas * tarifaHora;
                double porcentajeDescuento = 0.0;

                if (horas > 10) {
                    porcentajeDescuento = DESC_10_HORAS;
                } else if (horas > 5) {
                    porcentajeDescuento = DESC_5_HORAS;
                }

                double descuentoMonto = subtotal * porcentajeDescuento;
                double totalPagar = subtotal - descuentoMonto;

                System.out.println("\n--- TICKET DE ESTACIONAMIENTO ---");
                System.out.println("Tipo de vehículo: " + nombredelVehiculo);
                System.out.println("Horas estacionado: " + horas);
                System.out.println("Tarifa por hora: $" + tarifaHora);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "% ($" + descuentoMonto + ")");
                System.out.println("Total a pagar: $" + totalPagar);
            }
            scanner.close();

        }
    }

