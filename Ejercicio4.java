package resol.NizS;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (aaaa-mm-dd): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        DayOfWeek diaSemana = fecha.getDayOfWeek();
        System.out.println("Naciste un " + diaSemana);
    }
}
