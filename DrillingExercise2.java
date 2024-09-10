import java.util.Scanner;

public class DrillingExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;

        // Solicitar 10 números enteros
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce número:"); // Mensaje corregido
            int numero = scanner.nextInt();

            // Contar positivos, negativos y ceros
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar el total de positivos, negativos y ceros
        System.out.println("El numero de ceros introducidos es de: " + ceros);
        System.out.println("El numero Positivos introducidos es de: " + positivos);
        System.out.println("El numero Negativos introducidos es de: " + negativos);

        // Cerrar el scanner
        scanner.close();
    }
}

