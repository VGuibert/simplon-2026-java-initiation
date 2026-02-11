package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un tableau
 */
public class Exercise07ArraysSumAverage {
    
    /**
     * Calcule la somme de tous les éléments d'un tableau
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {
        int sum = 0;
        for ( int i = 0 ; i < array.length ; i ++){
            sum += array[i];
        }
        return sum;
    }
    
    /**
     * Calcule la moyenne des éléments d'un tableau
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        return sum(array) / array.length;
    }
    
    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
        int countSuperiorElement = 0;
        for (int j : array) {
            if (j > average(array)) {
                countSuperiorElement++;
            }
        }
        return countSuperiorElement;
    }
    
    /**
     * Calcule la somme des nombres pairs dans un tableau
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
        int sum = 0;
       for (int i = 0 ; i < array.length; i++) {
            if ( array[i] % 2 == 0) {
                sum += array[i];
            }
       }
        return sum;
    }
    
    /**
     * Calcule le produit de tous les éléments d'un tableau
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {
        int sum = array[0];
        for ( int i = 1 ; i < array.length ; i ++){
            sum = sum * array[i];
        }
        return sum;
    }
}
