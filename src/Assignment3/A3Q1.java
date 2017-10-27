/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 0, 2, Direction.WEST);

        //change karels color
        karel.setColor(Color.CYAN);

        // create a square with walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);

        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);

        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);





        // make karel move around the square  
        for (int moveCounter = 0; moveCounter < 8; moveCounter = moveCounter + 1) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();


        }
    }
}
