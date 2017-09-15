/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new city named England
        City england = new City();
        
        //create 2 robots 
        Robot karel = new Robot(england, 0, 0, Direction.SOUTH);
        Robot hunter = new Robot(england, 0, 1, Direction.SOUTH);
        
        //change robot's colours
        karel.setColor(Color.BLUE);
        hunter.setColor(Color.RED);
        
        //create walls
        new Wall(england, 0, 1, Direction.WEST);
        new Wall(england, 1, 1, Direction.WEST);
        new Wall(england, 1, 1, Direction.SOUTH);
        
        //make the robots face each other 
        
        karel.move();
        hunter.move();
        karel.move();
        hunter.turnLeft();
        hunter.move();
        hunter.turnLeft();
        hunter.turnLeft();
        hunter.turnLeft();
        hunter.move();
        hunter.turnLeft();
        hunter.turnLeft();
        hunter.turnLeft();
        karel.turnLeft();
        karel.move();
        hunter.move();
        
                
    }
}
