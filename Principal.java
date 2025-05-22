package resol.NizS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el ejercicio a ejecutar (1-6): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> Ejercicio1.ejecutar();
            case 2 -> Ejercicio2.ejecutar();
            case 3 -> Ejercicio3.ejecutar();
            case 4 -> Ejercicio4.ejecutar();
            case 5 -> Ejercicio5.ejecutar();
            case 6 -> Ejercicio6.ejecutar();
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
