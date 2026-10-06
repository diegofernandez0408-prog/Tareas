import java.util.Scanner;

public class SistemaDeCalificaciones {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final double MINIMO_APROBATORIO = 70;
        final double MINIMO_UNIDAD = 60;

        System.out.println(" Escribe tu primer calificacion ");
        double Calificacion1 = scanner.nextInt();
        System.out.println(" Escribe tu segunda Calificacion ");
        double Calificacion2 = scanner.nextInt();
        System.out.println(" Escribe tu tercera calicacion ");
        double Calificacion3 = scanner.nextInt();
        double promedio = (Calificacion1 + Calificacion2 + Calificacion3 ) / 3.0;

        System.out.println("\n ===== RESULTADOS =====");
        System.out.println(" Calificacion de la Unidad 1: " + Calificacion1 );
        System.out.println(" Calificacion de la Unidad 2: " + Calificacion2 );
        System.out.println(" Calificacion de la Unidad 3: " + Calificacion3 );
        System.out.println(" Promedio Final: " + promedio );

        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println(" Resultado Final: Alumno Aprobado. ");
        } else {
            System.out.println(" Resultados fial: Alumno Reprobado. ");
        }
        if (Calificacion1 < MINIMO_APROBATORIO ) {
            System.out.println("-> Deberas Presentar Recuperar la Unidad 1");
        }
        if (Calificacion2 < MINIMO_APROBATORIO ) {
            System.out.println("-> Deberas Presentar Recuperar la Unidad 2");
        }
        if (Calificacion3 < MINIMO_APROBATORIO ) {
            System.out.println("-> Deberas Presentar Recuperar la Unidad 3");
        }

    }
}
