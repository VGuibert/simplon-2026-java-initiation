package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union, intersection, différence)
 */
public class Exercise10SetOperations {
    
    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        /*if (Arrays.stream(array).anyMatch(value1 -> value1 == value)){
            return true;
        };
        return false;*/
        for (int i = 0 ; i < array.length ; i ++){
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {
        int[] newTab = new int[array2.length+array1.length];
        int index = 0;
        for( int element : array1){
            if ( !contains(newTab, element)){
                newTab[index] = element;
                index++;
            }
           }
        for ( int element : array2){
            if ( !contains(newTab, element)){
                newTab[index] = element;
                index++;
            }
        }
        int[] newTabFinish = new int[index];
        for (int x = 0; x < index ; x++) {
            newTabFinish[x] = newTab[x];
        }
        return newTabFinish;
    }

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {
        int[] newTab = new int[array2.length+array1.length];
        int index = 0;
        for (int elementArray1 : array1){
            for( int elementArray2 : array2){
                if( elementArray1 == elementArray2) {
                    newTab[index] = elementArray2;
                    index ++;
                }
            }
        }
        int[] newTabFinish = new int[index];
        for (int i = 0; i < newTabFinish.length ; i++) {
            newTabFinish[i] = newTab[i];
        }
        return newTabFinish;
    }
    
    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
        int index = 0;
        int[] newTab = new int[array2.length+array1.length];
        for (int i : array1){
            if (!contains(array2, i)){
                newTab[index] = i;
                index ++;
            }
        }
        int[] newTabFinish = new int[index];
        for (int i = 0; i < index ; i++) {
            newTabFinish[i] = newTab[i];
        }
        return newTabFinish;
    }
    
    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        int[] newTab = new int[array2.length+array1.length];
        int index = 0;
        for (int element : array1){
            if( !contains(array2, element)){
                newTab[index] = element;
                index ++;
            }
        }
        for (int element : array2){
            if( !contains(array1, element)){
                newTab[index] = element;
                index ++;
            }
        }
        int[] newTabFinish = new int[index];
        for (int i = 0; i < index ; i++) {
            newTabFinish[i] = newTab[i];
        }
        return newTabFinish;
    }
    
    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {
        boolean flag = true;
        for (int i : array1){
            if (contains(array2, i)){
                flag =true;
            }
            else
            {
                flag = false;
            }
        }
        return flag;
    }
    
    /**
     * Supprime les doublons d'un tableau
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        int index = 0;
        int[] newTab = new int[array.length];
        Arrays.sort(array);
        for (int element : array){
            if ( !contains(newTab, element)){
                newTab[index] = element;
                index ++;
            }
        }
        int[] newTabFinish = new int[index];
        for (int i = 0; i < index ; i++) {
            newTabFinish[i] = newTab[i];
        }
        return newTabFinish;

    }
    
    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
        if (array == null || 0 == array.length){
            return 0;
        }
        Arrays.sort(array);
        int nbrUnique = 1;
        for (int i = 0; i < array.length-1; i++) {
            if ( array[i] != array[i+1] ){
                nbrUnique++;
            }
        }
        return nbrUnique;
    }
}
