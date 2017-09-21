/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 4, 1, Direction.EAST);
        
        //change karels color
        karel.setColor(Color.CYAN);
        
        //create hurdles 
        
       new Wall(kw, 4, 1, Direction.SOUTH);
       new Wall(kw, 4, 2, Direction.SOUTH);
       new Wall(kw, 4, 3, Direction.SOUTH);
       new Wall(kw, 4, 4, Direction.SOUTH);
       new Wall(kw, 4, 5, Direction.SOUTH);
       new Wall(kw, 4, 6, Direction.SOUTH);
       new Wall(kw, 4, 7, Direction.SOUTH);
       new Wall(kw, 4, 8, Direction.SOUTH);
       new Wall(kw, 4, 9, Direction.SOUTH);
       new Wall(kw, 4, 1, Direction.EAST);
       new Wall(kw, 4, 2, Direction.EAST);
       new Wall(kw, 4, 4, Direction.EAST);
       new Wall(kw, 4, 7, Direction.EAST);
       // Create a thing
       new Thing(kw, 4, 9);
       
       //create an algortihm to make karel jump over hurdles
       while(!karel.canPickThing() == true){

                  if(karel.frontIsClear() != true){
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
                        
                        
                      
                    }else{
                      karel.move();
       }
           

           
       }
           
       


        
        
    }
}
