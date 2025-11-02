public class MergeSort {

    // divide el arreglo y llama repetivamente
    public void sort(int[] arr, int left, int right, boolean pasos, View view) {
        if (left < right) {
            int medio = (left + right) / 2;

            // ordenar mitad izquierda
            sort(arr, left, medio, pasos, view);
            // ordenar mitad derecha
            sort(arr, medio + 1, right, pasos, view);
            // mezclar
            merge(arr, left, medio, right);

            // mostrar paso si el usuario lo pidió
            if (pasos) {
                view.printArray("Paso:", arr);
            }
        }
    }

    // mezcla dos subarreglos ordenados
    private void merge(int[] arr, int left, int medio, int right) {
        int n1 = medio - left + 1;
        int n2 = right - medio;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // copiar datos
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        // mezclar
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // copiar lo que quede
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
