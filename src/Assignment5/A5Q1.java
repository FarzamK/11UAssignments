/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // create a boolean and make it equal false 
        boolean vowel = false;
        System.out.println("Please enter a word ");
        // create a sting that the user will input
        String word = input.nextLine();
        // create a blank string that will be edited by the string builder
        String translated = "";
        // create a string builder
        StringBuilder sb = new StringBuilder(translated);
        // for loop to add to the 
        for (int i = 0; i < word.length(); i++) {
            // finds the vowel and adds ub to a string and then adds the vowel
            if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o') && vowel == false) {
                sb.append("ub");
                sb.append(word.charAt(i));
                vowel = true;

                // if it finds a vowel after another vowel that has already been found, it doesn't add ub to the second vowel
            } else if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o') && vowel == true) {
                sb.append(word.charAt(i));
                // If it finds a consonant it adds the consonant back and starts the whole process again by declaring vowel = false
            } else {
                sb.append(word.charAt(i));
                vowel = false;



            }

        }
        //print out the translated word
        System.out.println(sb);
    }
}
