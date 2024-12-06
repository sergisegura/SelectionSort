package ioc.xtec.cat.selectionsort;

/**
 * Classe que conté métodes per a ordenar valors d'un array o bè indicar si un valor
 * existeix en aquest (o altre).
 * @author Sergi Segura
 * @version 1.0
 */

public class SelectionSort {

/**
 * Métode que ordena arrays d'enters de menor a major.
 * Va deixant el menor valor en primera posició mentre compara el següent valor i 
 * així fins que queda ordenat.
 * @param arr és l'array d'enters que rep per parametre.
 */
   public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

   /**
    * Mètode que comprova si un valor és present en un array d'enters.
    * @param arr és l'array d'enters que rep per parametre.
    * @param value el valor a cercar
    * @return true si el valor existeix o false en cas contrari.
    * @throws IllegalArgumentException si l'array passat per paràmetre és null.
    */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
