/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author farza
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// create a scanner
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        // ask for how many marks
        System.out.println("Enter the number of students. ");
        int students= input2.nextInt();

        //create variable to hold last number
        int last = students - 1;




        // create an array with x slots
        int marks[] = new int[students];
        System.out.println("Enter the students grades: ");

        //go through array to collect marks
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();

        }
        for (int x = 0; x < marks.length; x++) {


            for (int y = 0; y < marks.length; y++) {
                if (y != last && marks[y] > marks[y + 1]) {
                    int tool = marks[y];

                    marks[y] = marks[y + 1];

                    marks[y + 1] = tool;
                }
            }
        }

       

        double average = 0;

        for(int y = 0; y < marks.length; y++){
        average = average + marks[y];

        }
        double average2 = (average / students);
        
        double average3 = Math.round(average2 *10);
        
        double averageFinal = average3/10;

        System.out.println("The lowest mark in the class is: " + marks[0]);

        System.out.println("The highest mark in the class is: " + marks[0 + last]);


        System.out.println("The class average is: " + averageFinal);
    }
    
}





