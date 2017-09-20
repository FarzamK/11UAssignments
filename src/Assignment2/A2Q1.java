/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        //change karels color
        karel.setColor(Color.BLUE);
       
        //Put 10 thing in a row
        
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        
        //Write an algorithm to make karel pick 7 of them and continue walking 
        while (karel.getAvenue() !=  12) {
            karel.move();
            if (karel.getAvenue() < 9)
                karel.pickThing();
            

            
        }
            
            
        
    }
        



    }

