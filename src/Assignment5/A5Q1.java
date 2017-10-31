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

                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e'|| word.charAt(i) == 'u' || word.charAt(i) == 'i'|| word.charAt(i) == 'o') && vowel == false) {
                    sb.append("ub");
                    sb.append(word.charAt(i));
                    vowel = true;
                    
                    





                }else if((word.charAt(i) == 'a' || word.charAt(i) == 'e'|| word.charAt(i) == 'u' || word.charAt(i) == 'i'|| word.charAt(i) == 'o') && vowel == true){
                   sb.append(word.charAt(i));
                   
                }else{
                    sb.append(word.charAt(i));
                    vowel = false;
                    
                   
                    
                }
                
            }
            System.out.println(sb);
        }
    }

