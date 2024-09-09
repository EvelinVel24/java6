import java.util.Scanner;

public class DrillingExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;

        // Solicitar 10 números enteros
        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar el total de positivos, negativos y ceros
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // Cerrar el scanner
        scanner.close();
    }
}
