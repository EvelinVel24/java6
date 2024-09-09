import java.util.Scanner;

public class DrillingExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Bucle para solicitar un número válido
        do {
            System.out.println("Ingrese un número de 1 al 100:");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("Error: Ingrese un número de 1 al 100.");
            }
        } while (numero < 1 || numero > 100);

        // Mostrar números pares e impares hasta el número ingresado
        System.out.println("El total de Números pares es:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nEl total de Números impares es:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Imprimir mensaje final
        System.out.println("\nFin del programa");

        // Cerrar el scanner
        scanner.close();
    }
}

