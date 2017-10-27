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
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a word ");
            String word = input.nextLine();


            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o') {
                    String front = word.substring(0, i);
                    String ending = word.substring(i);

                    word = front + "ub" + ending;


                    i = i + 3;



                }



            }
            System.out.println(word);
        }
    }
}
