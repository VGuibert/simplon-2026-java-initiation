package fr.simplon.exercises;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {
    
    /**
     * Inverse une chaîne de caractères
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {
        String reversedStr = "";

        for ( int i = 0; i < str.length(); i ++){
            reversedStr = str.charAt(i) + reversedStr;
        }

        return reversedStr;
    }
    
    /**
     * Vérifie si une chaîne est un palindrome
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {
        if (str.equals(reverseString(str))){
            return true;
        }
        else {
            return false;
        }

    }
    
    /**
     * Compte le nombre de voyelles dans une chaîne
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        String newStr = str.toLowerCase();
        int nbrVoyelles = 0;
        for ( int i = 0; i < str.length(); i ++){
            switch (newStr.charAt(i)) {
                case 'a' :
                    nbrVoyelles ++;
                    break;
                case 'e' :
                    nbrVoyelles ++;
                    break;
                case 'i' :
                    nbrVoyelles ++;
                    break;
                case 'o' :
                    nbrVoyelles ++;
                    break;
                case 'u' :
                    nbrVoyelles ++;
                    break;
            }
        }
        return nbrVoyelles;
    }
    
    /**
     * Compte le nombre de mots dans une chaîne
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }
    
    /**
     * Met la première lettre de chaque mot en majuscule
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        String[] stringSPlit = str.split("\\s");
        StringBuilder stringWithUpperCase = new StringBuilder();
        for ( String word : stringSPlit){
            stringWithUpperCase.append(Character.toTitleCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return stringWithUpperCase.toString().trim() ;

    }
}
