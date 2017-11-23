/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners for input
        Scanner input = new Scanner(System.in);
        Scanner students = new Scanner(System.in);
        
        System.out.println("How many students are there?");
        
        int people = students.nextInt();
        // create an array
        
        int[] grades = new int[people];
        // display out a statement to tell the user to put in the two numbers
        System.out.println("Enter the marks");
        
         
        // for loop  
        for (int i = 0; i < people; i++) {
            grades[i] = input.nextInt(); 
        }
        
        for(int z = 0; z < grades.length; z++){
        
        for(int y = 0; y < grades.length-1; y++){
            if(grades[y] > grades[y+1]){
                int store = grades[y];
                
                grades[y] = grades[y+1];
                
                grades[y+1] = store;
            }
            System.out.println("The marks in ascending order are: ");
            for(int p = 0; p < grades.length; p++){
                System.out.println(grades[p]);
            }
        }
    }
        int remainder = people % 2;
        if(remainder > 0){
            int median = (grades[(people - 1)/2]);
            System.out.println("The median of the marks is: " + median );
            
            
        }else{
            System.out.println("The median of the marks is:" + (grades[(people/2)] + grades[(people -1)/2])/2);
            
        }
}
}