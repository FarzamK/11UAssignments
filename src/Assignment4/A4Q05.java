/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A4Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner firstName = new Scanner(System.in);
        Scanner mark1 = new Scanner(System.in);
        Scanner score1 = new Scanner(System.in);
        Scanner mark2 = new Scanner(System.in);
        Scanner score2 = new Scanner(System.in);
        Scanner mark3 = new Scanner(System.in);
        Scanner score3 = new Scanner(System.in);
        Scanner mark4 = new Scanner(System.in);
        Scanner score4 = new Scanner(System.in);
        Scanner mark5 = new Scanner(System.in);
        Scanner score5 = new Scanner(System.in);
        
        
        
        System.out.println("Please enter your name");
        String name = firstName.nextLine();
        
        System.out.println("What was the first test out?");
        double scoreOne = score1.nextDouble();
        
        System.out.println("What did you get get?");
        double markOne = mark1.nextDouble();
        
        System.out.println("What was the second test out of?");
        double scoreTwo = score2.nextDouble();
        
        System.out.println("What did you get?");
        double markTwo = mark2.nextDouble();
        
        System.out.println("What was the third test out of?");
        double scoreThree = score3.nextDouble();
        
        System.out.println("What did you get?");
        double markThree = mark3.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        double scoreFour = score4.nextDouble();
        
        System.out.println("What did you get?");
        double markFour = mark4.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        double scoreFive = score5.nextDouble();
        
        System.out.println("What did you get?");
        double markFive = mark5.nextDouble();
        
        
        
        double scoreMarkOne = markOne/scoreOne * 100;
        
        double scoreMarkTwo = markTwo/scoreTwo * 100;
        
        double scoreMarkThree = markThree/scoreThree * 100;
        
        double scoreMarkFour = markFour/scoreFour * 100;
        
        double scoreMarkFive = markFive/scoreFive * 100;
        
        System.out.println("Test 1: " + scoreMarkOne + "%");
        
        System.out.println("Test 2: " + scoreMarkTwo + "%");
        
        System.out.println("Test 3: " + scoreMarkThree + "%");
                
        System.out.println("Test 4: " + scoreMarkFour + "%");
        
        System.out.println("Test 5: " + scoreMarkFive + "%");
        
        double average = (scoreMarkOne + scoreMarkTwo + scoreMarkThree + scoreMarkFour + scoreMarkFive) / 5;
        
        System.out.println("Average: " + average + "%");
        
    }
}
