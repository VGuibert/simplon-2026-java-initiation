package fr.simplon.exercises;

/**
 * Exercice 14: Tri à bulles (Bubble Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri le plus simple
 */
public class Exercise14BubbleSort {
    
    /**
     * Trie un tableau en utilisant l'algorithme de tri à bulles
     * @param array le tableau à trier
     * @return le tableau trié (modifier le tableau en place)
     */
    public int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
    /**
     * Trie un tableau en ordre décroissant avec le tri à bulles
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] bubbleSortDescending(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] <= array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
    /**
     * Compte le nombre d'échanges effectués pendant le tri à bulles
     * @param array le tableau à trier
     * @return le nombre d'échanges effectués
     */
    public int countSwaps(int[] array) {
        int countSwap=0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    countSwap++;
                }
            }
        }
        return countSwap;
    }
    
    /**
     * Trie uniquement les k premiers éléments d'un tableau avec le tri à bulles
     * @param array le tableau
     * @param k le nombre d'éléments à trier
     * @return le tableau avec les k premiers éléments triés
     */
    public int[] partialBubbleSort(int[] array, int k) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < k; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;

    }
}
