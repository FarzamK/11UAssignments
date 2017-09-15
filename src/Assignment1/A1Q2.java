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
public class A1Q2 {
    private static City england;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new city named England
        City england = new City();
        
        //create a robot 
        Robot karel = new Robot(england, 1, 2, Direction.SOUTH);
        
        new Thing(england, 2, 2);
        
        //change karel colour
        karel.setColor(Color.MAGENTA);
                
        //Create a square using walls
        new Wall(england, 1, 1, Direction.NORTH);
        new Wall(england, 1, 2, Direction.NORTH);
        new Wall(england, 1, 1, Direction.WEST);
        new Wall(england, 2, 1, Direction.WEST);
        new Wall(england, 2, 1, Direction.SOUTH);
        new Wall(england, 1, 2, Direction.EAST);
        new Wall(england, 1, 2, Direction.SOUTH);
        
        //Get karel to get newspaper and return to bed
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        
        //make karel pick thing
        karel.pickThing();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        
                
    }
}
