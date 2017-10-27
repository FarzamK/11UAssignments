/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 1, 2, Direction.EAST);

        //change karels color
        karel.setColor(Color.YELLOW);

        //create counter for things
        kw.showThingCounts(true);

        //create Things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);

        for (int count = 0; count < 10; count = count + 1) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();

        }
        karel.move();
    }
}
