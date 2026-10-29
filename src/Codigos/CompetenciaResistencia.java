package Codigos;

import java.util.Scanner;

    public class CompetenciaResistencia {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char opcion;

            do {
                int participantes = 0;
                while (participantes <= 0) {
                    System.out.println("Cantidad de participantes:");
                    participantes = scanner.nextInt();
                }
                double mayorDistancia = 0;
                int mejorParticipante = 0;
                for (int p = 1; p <= participantes; p++) {
                    System.out.println("Participante " + p);
                    double total = 0;
                    int bajo = 0;
                    int medio = 0;
                    int alto = 0;
                    for (int r = 1; r <= 5; r++) {
                        double distancia = -1;
                        while (distancia < 0) {
                            System.out.println("Distancia de la ronda " + r + ":");
                            distancia = scanner.nextDouble();
                        }
                        total += distancia;
                        if (distancia < 2) {
                            bajo++;
                        } else if (distancia <= 4) {
                            medio++;
                        } else {
                            alto++;
                        }
                    }
                    double promedio = total / 5;
                    if (total > mayorDistancia) {
                        mayorDistancia = total;
                        mejorParticipante = p;
                    }
                    System.out.println("\nMENU");
                    System.out.println("1. Distancia total");
                    System.out.println("2. Promedio");
                    System.out.println("3. Categorias");
                    System.out.println("4. Todo");
                    System.out.println("Selecciona una opcion:");
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Distancia total: " + total);
                            break;
                        case 2:
                            System.out.println("Promedio: " + promedio);
                            break;
                        case 3:
                            System.out.println("Bajas: " + bajo);
                            System.out.println("Medias: " + medio);
                            System.out.println("Altas: " + alto);
                            break;
                        case 4:
                            System.out.println("Distancia total: " + total);
                            System.out.println("Promedio: " + promedio);
                            System.out.println("Bajas: " + bajo);
                            System.out.println("Medias: " + medio);
                            System.out.println("Altas: " + alto);
                            break;

                        default:
                            System.out.println("Opcion no valida.");
                    }
                }
                System.out.println("\nRESULTADO GENERAL");
                System.out.println("Participante con mayor distancia: " + mejorParticipante);
                System.out.println("Distancia acumulada: " + mayorDistancia);

                System.out.println("\n¿Registrar otra competencia? (S/N)");
                opcion = scanner.next().charAt(0);

            } while (opcion == 'S');
        }
    }