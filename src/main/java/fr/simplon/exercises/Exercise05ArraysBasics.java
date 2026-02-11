package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 5: Tableaux - Opérations de base
 * 
 * Objectif: Apprendre à manipuler des tableaux
 */
public class Exercise05ArraysBasics {
    
    /**
     * Crée un tableau contenant les nombres de 1 à n
     * @param n la taille du tableau
     * @return un tableau [1, 2, 3, ..., n]
     */
    public int[] createSequence(int n) {

        int[] monTableau = new int[n];

        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = 1+i;
        }
        return monTableau;
    }
    
    /**
     * Retourne le premier élément d'un tableau
     * @param array le tableau
     * @return le premier élément
     */
    public int getFirstElement(int[] array) {
        return array[0];
    }
    
    /**
     * Retourne le dernier élément d'un tableau
     * @param array le tableau
     * @return le dernier élément
     */
    public int getLastElement(int[] array) {
        int lastElement = array.length;
        return array[lastElement-1];
    }
    
    /**
     * Compte le nombre d'occurrences d'une valeur dans un tableau
     * @param array le tableau
     * @param value la valeur à chercher
     * @return le nombre d'occurrences
     */
    public int countOccurrences(int[] array, int value) {
        int countOccurrences = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                countOccurrences++;
            }
        }
        return countOccurrences;
    }
    
    /**
     * Vérifie si un tableau contient une valeur
     * @param array le tableau
     * @param value la valeur à chercher
     * @return true si la valeur est présente, false sinon
     */
    public boolean contains(int[] array, int value) {

        boolean valueIsPresent = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                valueIsPresent = true;
            }
        }
        return valueIsPresent;
    }
}
