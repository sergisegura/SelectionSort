package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Classe principal que executarà els metodes necessaris de SelectionSort
 * @author Sergi Segura
 * @version 1.0
 */

public class Main {
    
    /**
     * Mètode principal que s'encarregarà d'executar els programes en una seqüència concreta.
     * @param args son arguments passats per linia de comandes que, en aquest cas no ho utilitza. 
     * Les dades que si es tractaràn son aquelles que pasen per l'scanner.
     */
    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");
        
        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

/**
 * Metode que imprimeix els elements de l'array en el moment de la crida a aquest metode.
 * @param arr l'array que rep per paràmetre per a imprimir.
 */
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
