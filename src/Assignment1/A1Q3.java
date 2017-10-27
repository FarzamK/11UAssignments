/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create a new city named England
        City england = new City();

        //create a robot 
        Robot karel = new Robot(england, 3, 0, Direction.EAST);

        new Thing(england, 3, 1);

        //change karel colour
        karel.setColor(Color.YELLOW);

        //create walls \
        new Wall(england, 3, 2, Direction.WEST);
        new Wall(england, 3, 2, Direction.NORTH);
        new Wall(england, 2, 3, Direction.WEST);
        new Wall(england, 1, 3, Direction.WEST);
        new Wall(england, 1, 3, Direction.NORTH);
        new Wall(england, 1, 3, Direction.EAST);
        new Wall(england, 2, 4, Direction.NORTH);
        new Wall(england, 2, 4, Direction.EAST);
        new Wall(england, 3, 4, Direction.EAST);

        //make karel move, pick up the thing and deliver
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();






    }
}
