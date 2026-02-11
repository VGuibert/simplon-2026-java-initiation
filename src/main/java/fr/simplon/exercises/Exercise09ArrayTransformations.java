package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux existants
 */
public class Exercise09ArrayTransformations {
    
    /**
     * Double tous les éléments d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        for(int i = 0; i < array.length; i ++){
            array[i] = array[i]*2;
        }
        return array;
    }
    
    /**
     * Filtre les nombres pairs d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
       int[] newTab = new int[0];
       int entry = 0;
        for ( int i = 0; i < array.length ; i++) {
            if ( array[i] % 2 == 0){
                newTab = Arrays.copyOf(newTab, newTab.length+1);
                newTab[entry] = array[i];
                entry ++;
            }
        }
        return newTab;
    }
    
    /**
     * Copie un tableau dans l'ordre inverse
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {
        int tempFirst;
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length/2; i++){
            tempFirst = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = tempFirst;
            lastIndex --;
        }
        return array;
    }
    
    /**
     * Concatène deux tableaux
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int[] arrayConcat = new int[array1.length+array2.length];
        int lastIndex = 0;
        for (int i = 0; i < array1.length; i++){
            arrayConcat[lastIndex] = array1[i];
            lastIndex++;
        }
        for (int y = 0; y < array2.length; y++){
            arrayConcat[lastIndex] = array2[y];
            lastIndex++;
        }
        return arrayConcat;
    }
    
    /**
     * Extrait une sous-partie d'un tableau
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int[] newTab = new int[end-start];
        int newIndex =0;
        for (int i = start; i < end; i++) {
            newTab[newIndex] = array[i];
            newIndex++;
        }
        return newTab;
    }
}
