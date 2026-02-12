package fr.simplon.exercises;

/**
 * Exercice 16: Tri par insertion (Insertion Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri par insertion, similaire au tri de cartes
 */
public class Exercise16InsertionSort {

    public int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int index = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > index){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = index;
        }
    return array;
    }
    
    /**
     * Trie un tableau en ordre décroissant avec le tri par insertion
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] insertionSortDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int index = array[i];
            int j = i-1;

            while (j >= 0 && array[j] < index){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = index;
        }
        return array;

    }
    
    /**
     * Compte le nombre de décalages effectués pendant le tri par insertion
     * @param array le tableau à trier
     * @return le nombre de décalages effectués
     */
    public int countShifts(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int index = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > index){
                array[j+1] = array[j];
                j--;
                count ++;
            }
            array[j+1] = index;
        }
        return count;

    }
    
    /**
     * Insère un élément à sa place dans un tableau déjà trié
     * @param sortedArray le tableau trié
     * @param element l'élément à insérer
     * @return un nouveau tableau avec l'élément inséré à la bonne place
     */
    public int[] insertIntoSorted(int[] sortedArray, int element) {
        int[] newTab = new int[sortedArray.length+1];
        int index = 0;
        for (int i = 0; i < newTab.length-1; i++) {
            newTab[i] = sortedArray[i];
            index ++;
        }
        newTab[index] = element;
        insertionSort(newTab);
        return newTab;
    }
}
