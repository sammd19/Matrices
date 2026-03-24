//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
                int ce, ma;
                double[][] mn;
                double nota;
                double suma, promedio;
                double sg = 0;
                System.out.print("Cantidad de estudiantes: ");
                ce = lector.nextInt();

                System.out.print("Cantidad de materias: ");
                ma = lector.nextInt();
                mn = new double[ce][ma];

                for (int i = 0; i < ce; i++) {
                    for (int j = 0; j < ma; j++) {

                        System.out.print("Nota estudiante " + (i + 1) + ", materia " + (j + 1) + ": ");
                        nota = lector.nextDouble();

                        while (nota < 0 || nota > 5) {
                            System.out.print("Nota inválida. Intente: ");
                            nota = lector.nextDouble();
                        }

                        mn[i][j] = nota;
                    }
                }

                System.out.println("Notas:");
                for (int i = 0; i < ce; i++) {
                    for (int j = 0; j < ma; j++) {
                        System.out.print(mn[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("Promedio por estudiante:");
                for (int i = 0; i < ce; i++) {
                    suma = 0;
                    for (int j = 0; j < ma; j++) {
                        suma += mn[i][j];
                    }
                    promedio = suma / ma;
                    System.out.println("Estudiante " + (i + 1) + ": " + promedio);
                    sg += suma;
                }

                System.out.println("Promedio por materia:");
                for (int j = 0; j < ma; j++) {
                    suma = 0;
                    for (int i = 0; i < ce; i++) {
                        suma += mn[i][j];
                    }
                    promedio = suma / ce;
                    System.out.println("Materia " + (j + 1) + ": " + promedio);
                }

                promedio = sg / (ce * ma);
                System.out.println("Promedio general: " + promedio);
            }
        }