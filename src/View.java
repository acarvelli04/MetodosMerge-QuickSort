import java.util.Scanner;

/**
 * El propósito de View es mostrar menús, leer del usuario
 * e imprimir arreglos. NO ordena, solo muestra.
 */
public class View {

    private final Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    // ---------- MENÚ PRINCIPAL ----------
    public int showMenuAndRead() {
        System.out.println("\n-- Menú Métodos --");
        System.out.println("1 --> MergeSort");
        System.out.println("2 --> QuickSort");
        System.out.print("Seleccione la opción: ");
        return inputOption(2);
    }

    // ---------- MENÚ MOSTRAR PASOS ----------
    public int showPasosMenuAndRead() {
        System.out.println("\n-- ¿Mostrar pasos? --");
        System.out.println("1 --> Sí, paso a paso");
        System.out.println("2 --> No, solo resultado final");
        System.out.print("Seleccione la opción: ");
        return inputOption(2);
    }

    // Valida que la opción esté entre 1 y max
    private int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= max) {
                    break;
                } else {
                    System.out.print("Opción inválida, ingrese otra vez: ");
                }
            } else {
                scanner.next(); // limpiar basura
                System.out.print("Opción inválida, ingrese otra vez: ");
            }
        }
        return option;
    }

    // ---------- IMPRESIÓN DE ARREGLOS ----------
    public void printArray(String titulo, int[] arr) {
        System.out.println("\n" + titulo);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}