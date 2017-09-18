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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create a new city named England
        City england = new City();
        //this is a test
        //create 2 robots 
        Robot karel = new Robot(england, 3, 3, Direction.EAST);
        Robot maria = new Robot(england, 0, 1, Direction.WEST);
        
        //change robot's colours
        karel.setColor(Color.BLUE);
        maria.setColor(Color.RED);
        //set labels on the robots
        karel.setLabel("K");
        maria.setLabel("M");
        //put things
        
        new Thing(england, 0, 0);
        new Thing(england, 1, 0);
        new Thing(england, 1, 1);
        new Thing(england, 1, 2);
        new Thing(england, 2, 2);
        
        //create walls 
        new Wall(england, 2, 3, Direction.WEST);
        new Wall(england, 2, 3, Direction.NORTH);
        new Wall(england, 2, 3, Direction.EAST);
        new Wall(england, 3, 3, Direction.EAST);
        new Wall(england, 3, 3, Direction.SOUTH);
        
        //make karel and maria pick up the grocceries
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
        karel.move();
        maria.pickThing();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        karel.move();
        maria.pickThing();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        karel.turnLeft();
        maria.pickThing();
        
        //
    }
}
