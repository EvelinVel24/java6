import java.util.Scanner;

public class DrillingExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Bucle para solicitar un número válido
        do {
            System.out.println("Ingresa un número entre 1 y 100:");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("Error: El número debe estar entre 1 y 100.");
            }
        } while (numero < 1 || numero > 100);

        // Mostrar números pares e impares hasta el número ingresado
        System.out.println("Números pares:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros impares:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
