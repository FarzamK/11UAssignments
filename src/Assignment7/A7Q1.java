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
public class A7Q1 {
    public double circleArea(double radius){
        // do the math for the area
        double area = Math.PI * (Math.pow(radius, 2));
        // return the area
        return area;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ask the user to enter the radius of a circle
        System.out.println("What is the radius of the circle?");
        // creating an object
        A7Q1 run = new A7Q1();
        // create a scanner
        Scanner in = new Scanner(System.in);
        // create a double
        double radius = in.nextDouble();
        // store what the method returns into "area"
        double area = run.circleArea(radius);
        // display out the answer
        System.out.println("The area of the circle is " + area);
        
    }
}
