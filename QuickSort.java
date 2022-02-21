//Roberto Lagunes Alvarez

import java.util.Arrays;

public class QuickSort {
    private static int particion(int arreglo[], int izquierda, int derecha) {
        int intVector = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < intVector) {
                izquierda++;
            }
            while (arreglo[derecha] > intVector) {
                derecha--;
            }
            if (izquierda >= derecha) {

                return derecha;
            } else {

                int resultI = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = resultI;
                izquierda++;
                derecha--;
            }
        }
    }

    private static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int intVector= particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, intVector);
            quicksort(arreglo, intVector + 1, derecha);
        }
    }

    private static int particion(String arreglo[], int izquierda, int derecha) {

        String floatVector = arreglo[izquierda];

        while (true) {
            while (arreglo[izquierda].compareTo(floatVector) < 0) {
                izquierda++;
            }
            while (arreglo[derecha].compareTo(floatVector) > 0) {
                derecha--;
            }
            if (izquierda >= derecha) {

                return derecha;
            } else {
                String resultf = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = resultf;
                izquierda++;
                derecha--;
            }

        }
    }
    private static void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int floatVector= particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, floatVector);
            quicksort(arreglo, floatVector + 1, derecha);
        }
    }
}


