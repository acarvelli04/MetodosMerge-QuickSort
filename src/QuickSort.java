public class QuickSort {

    // método principal
    public void sort(int[] arr, int bajo, int alto, boolean pasos, View view) {
        if (bajo < alto) {
            int pi = particion(arr, bajo, alto);

            // mostrar paso si el usuario lo pidió
            if (pasos) {
                view.printArray("Paso:", arr);
            }

            // ordenar recursivamente las dos partes
            sort(arr, bajo, pi - 1, pasos, view);
            sort(arr, pi + 1, alto, pasos, view);
        }
    }

    // función para partir el arreglo
    private int particion(int[] arr, int bajo, int alto) {
        int pivot = arr[alto];
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            if (arr[j] < pivot) {
                i++;
                // intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // colocar el pivote en su lugar correcto
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }
}

