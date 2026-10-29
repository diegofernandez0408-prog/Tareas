import java.util.Scanner;

public class AhorroMensual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            final double interes = 0.01;

            int saldoIn = -1, meta = -1, ahorroMen = -1;

            while (saldoIn < 0) {
                System.out.println("Ingresa tu cantidad de dinero:");
                saldoIn = scanner.nextInt();
            }

            while (meta <= 0) {
                System.out.println("Meta del ahorro:");
                meta = scanner.nextInt();
            }

            while (ahorroMen <= 0) {
                System.out.println("Cantidad a ahorrar:");
                ahorroMen = scanner.nextInt();
            }

            System.out.println(" ---------- PLAZO ---------- ");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            System.out.println("Selecciona 1, 2 o 3");

            int meses;
            int plazo = scanner.nextInt();

            switch (plazo) {
                case 1:
                    meses = 6;
                    break;
                case 2:
                    meses = 12;
                    break;
                case 3:
                    meses = 24;
                    break;
                default:
                    System.out.println("Se usara el plazo por defecto de 12 meses...");
                    meses = 12;
                    break;
            }

            double saldoActual = saldoIn;
            double intereses = 0;

            boolean metaAlcanzada = false;
            int mesesMeta = 0;

            for (int m = 1; m <= meses; m++) {

                saldoActual += ahorroMen;

                double interesMes = saldoActual * interes;
                intereses += interesMes;
                saldoActual += interesMes;

                if (!metaAlcanzada && saldoActual >= meta) {
                    metaAlcanzada = true;
                    mesesMeta = m;
                }

                System.out.println("Mes " + m + "Saldo actual: $" + saldoActual);
            }

            System.out.println("\n----- RESULTADOS -----");
            System.out.println("Saldo final: $" + saldoActual);
            System.out.println("Intereses generados: $" + intereses);

            if (metaAlcanzada) {
                System.out.println("Meta alcanzada en " + mesesMeta + " meses.");
            } else {
                System.out.println("No se alcanzo la meta.");
            }

            System.out.println("\n¿Desea realizar otra simulacion?");
            System.out.println("S = Si / N = No");
            opcion = scanner.next().charAt(0);

        } while (opcion == 'S');

        System.out.println("Programa finalizado.");
    }
}