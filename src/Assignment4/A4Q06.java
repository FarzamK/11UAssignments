/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author farza
 */
public class A4Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for the speed limit
        Scanner speedLimit = new Scanner(System.in);

        // Ask the user to input the speed limit
        System.out.println("Enter the speed limit:");

        // Assign a variable to the speed limit the user entered
        int limitSpeed = speedLimit.nextInt();

        // create the scanner for the recorded speed
        Scanner carSpeed = new Scanner(System.in);

        // Ask the user to input the recorded speed
        System.out.println("Enter the recorded speed of the car:");

        // Assign a variable to the recorded speed of the car
        int speedCar = carSpeed.nextInt();

        //output if user has a fine 
        if (speedCar > limitSpeed && speedCar <= limitSpeed + 20) {
            System.out.println("You are speeding and your fine is $100");

        }

        if (speedCar > limitSpeed + 21 && speedCar <= limitSpeed + 30) {
            System.out.println("You are speeding and your fine is $270");
        }

        if (speedCar > limitSpeed + 31) {
            System.out.println("You are speeding and your fine is $500");
        }






    }
}
