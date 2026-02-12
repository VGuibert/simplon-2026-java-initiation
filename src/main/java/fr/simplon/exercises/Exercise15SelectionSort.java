package fr.simplon.exercises;

/**
 * Exercice 15: Tri par sélection (Selection Sort)
 * 
 * Objectif: Apprendre un algorithme de tri efficace basé sur la sélection du minimum
 */
public class Exercise15SelectionSort {
    
    /**
     * Trie un tableau en utilisant l'algorithme de tri par sélection
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
    return array;
    }
    
    /**
     * Trie un tableau en ordre décroissant avec le tri par sélection
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] selectionSortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] > array[index]){
                    index = j;
                }
            }
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
        return array;

    }
    
    /**
     * Trouve les k plus petits éléments d'un tableau (non triés entre eux)
     * @param array le tableau
     * @param k le nombre d'éléments à trouver
     * @return un tableau contenant les k plus petits éléments
     */
    public int[] findKSmallest(int[] array, int k) {
        int[] arrayOfK = new int[k];
        selectionSort(array);
        for (int y = 0; y < k ; y++) {
            arrayOfK[y] = array[y];
        }

        return arrayOfK;

    }
    
    /**
     * Compte le nombre de comparaisons effectuées pendant le tri par sélection
     * @param array le tableau à trier
     * @return le nombre de comparaisons
     */
    public int countComparisons(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] > array[index]){
                    index = j;
                    count ++;
                }
            }
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
        return count;

    }
}
