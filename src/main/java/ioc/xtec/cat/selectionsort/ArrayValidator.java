package ioc.xtec.cat.selectionsort;

/**
 * Classe que valida que l'array és o no null.
 * @author Sergi Segura
 * @version 1.0
 */

public class ArrayValidator {
    /**
     * Metode que valida un array d'enters.
     * @param arr l'array d'enters a validar.
     * @throws IllegalArgumentException si l'array passat per paràmetre és null.
     */

    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
