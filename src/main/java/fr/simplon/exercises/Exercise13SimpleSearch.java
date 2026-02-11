package fr.simplon.exercises;


import java.util.Arrays;

/**
 * Exercice 13: Recherche dans un tableau
 * 
 * Objectif: Apprendre à rechercher des éléments dans un tableau
 */
public class Exercise13SimpleSearch {
    
    
    /**
     * Vérifie si le tableau est trié en ordre croissant
     * @param array le tableau
     * @return true si le tableau est trié, false sinon
     */
    public boolean isSorted(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    /**
     * Recherche linéaire: trouve l'index d'une valeur dans un tableau
     * @param array le tableau
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int linearSearch(int[] array, int target) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                index = i;
                break;
            }
            else {
                index = -1;
            }
        }
        return index;
    }
    
    /**
     * Recherche binaire: trouve l'index d'une valeur dans un tableau TRIÉ
     * @param array le tableau trié
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int binarySearch(int[] array, int target) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                index = i;
                break;
            }
            else {
                index = -1;
            }
        }
        return index;

    }
    
    /**
     * Trouve tous les indices où une valeur apparaît
     * @param array le tableau
     * @param target la valeur à chercher
     * @return un tableau contenant tous les indices où la valeur apparaît
     */
    public int[] findAllIndices(int[] array, int target) {
        int[] indexOfValues = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                indexOfValues[index] = i;
                index++;
            }
        }
        int[] newTabFinish = new int[index];
        for (int i = 0; i < index ; i++) {
            newTabFinish[i] = indexOfValues[i];
        }
        return newTabFinish;

    }
    
    /**
     * Trouve le deuxième plus grand élément d'un tableau
     * @param array le tableau
     * @return le deuxième plus grand élément
     */
    public int findSecondMax(int[] array) {
        Arrays.sort(array);
        return array[array.length-2];
    }
}
