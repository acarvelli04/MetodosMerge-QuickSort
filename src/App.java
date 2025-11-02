public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido");
        int[] numeros = {5, 10, 20, 2, 40, 33, 7, 22, 4, 39, 1};

        View view = new View();

        // Mostrar orden original
        view.printArray("=== ORDEN ORIGINAL ===", numeros);

        // Menú principal: 1 Merge, 2 Quick
        int opcionMetodo = view.showMenuAndRead();

        // Menú de pasos: 1 sí, 2 no
        boolean mostrarPasos = view.showPasosMenuAndRead() == 1;

        // trabajamos con una COPIA para no perder el original
        int[] copia = numeros.clone();

        switch (opcionMetodo) {
            case 1: // MERGE
                MergeSort ms = new MergeSort();
                ms.sort(copia, 0, copia.length - 1, mostrarPasos, view);
                view.printArray("Resultado final:", copia);
                break;
            case 2: // QUICK
                QuickSort qs = new QuickSort();
                qs.sort(copia, 0, copia.length - 1, mostrarPasos, view);
                view.printArray("Resultado final:", copia);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
