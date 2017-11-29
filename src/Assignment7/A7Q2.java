/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A7Q2 {
    
    public void examGrades(int grade){
        // if grade is higher or equal to 80 
        if (grade >= 80){
            System.out.println("Your grade is an A");
        }else if (grade < 79 && grade > 70){
            System.out.println("Your grade is a B");   
        }else if (grade < 69 && grade > 60){
            System.out.println("Your grade is a C");
        }else if (grade < 59 && grade > 50){
            System.out.println("Your grade is a D");
        }else if (grade < 50){
            System.out.println("Your grade is an F");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner in = new Scanner(System.in);
        // ask the user what their grade is 
        System.out.println("What is your grade?");
        // create an object
        A7Q2 run = new A7Q2();
        // create a variable 
        int grade = in.nextInt();
        // running the method 
        run.examGrades(grade);
        
        
    }
}
