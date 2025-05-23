package resol.NizS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el ejercicio a ejecutar (1-10): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> Ejercicio1.ejecutar();
        break;
            case 2 -> Ejercicio2.ejecutar();
        break;
            case 3 -> Ejercicio3.ejecutar();
        break;
            case 4 -> Ejercicio4.ejecutar(); 
        break;
            case 5 -> Ejercicio5.ejecutar();
        break;
            case 6 -> Ejercicio6.ejecutar();
        break;
            case 7 -> Ejercicio7.ejecutar();
        break;
            case 8 -> Ejercicio8.ejecutar();
        break;
            case 9 -> Ejercicio9.ejecutar();
        break;
            case 10 -> Ejercicio10.ejecutar();
        default:
                System.out.println("Opción inválida. Ingrese un número del 1 al 10.");
                break;
        }

        scanner.close();
    }
}
