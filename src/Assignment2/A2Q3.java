/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 3, 2, Direction.EAST);

        //change karels color
        karel.setColor(Color.CYAN);

        //create an algorithm to make karel return to 0,0 no matter the position

        while (karel.getAvenue() != 0) {
            if (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            } else {
                karel.move();


            }

        }
        while (karel.getDirection() != Direction.NORTH) {
            karel.turnLeft();
        }
        while (karel.getStreet() != 0) {
            karel.move();
        }

    }
}
