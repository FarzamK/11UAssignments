/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);


        //create counter for things
        kw.showThingCounts(true);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 7, Direction.NORTH);
        new Wall(kw, 1, 8, Direction.NORTH);
        new Wall(kw, 1, 8, Direction.EAST);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);

        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);


// code karel to clear mine of debris 1 at a time
        while (karel.frontIsClear()) {
            karel.move();
            
            if (karel.canPickThing()) {
                karel.pickThing();
                
                if (!karel.frontIsClear()) {
                    // break the loop
                    break;
                }
                karel.turnLeft();
                karel.turnLeft();
                
                while (karel.frontIsClear()) {
                    karel.move();
                }

                // drop things at starting position
                karel.putThing();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
        // make karel return to start
        karel.turnLeft();
        karel.turnLeft();
        while (karel.frontIsClear()) {
            karel.move();
        }
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();

    }
}