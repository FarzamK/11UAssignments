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
public class A1Q1 {
    private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new city named England
        City england = new City();
        
        //create a robot 
        Robot karel = new Robot(england, 0, 2, Direction.WEST);
                
        //Create a square using walls
        new Wall(england, 1, 1, Direction.NORTH);
        new Wall(england, 1, 2, Direction.NORTH);
        new Wall(england, 1, 1, Direction.WEST);
        new Wall(england, 2, 1, Direction.WEST);
        new Wall(england, 2, 1, Direction.SOUTH);
        new Wall(england, 2, 2, Direction.SOUTH);
        new Wall(england, 2, 2, Direction.EAST);
        new Wall(england, 1, 2, Direction.EAST);
        
        
    
        //Change karel's colour
        karel.setColor(Color.BLUE);
        
        //make karel go around square
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        
    }
}
