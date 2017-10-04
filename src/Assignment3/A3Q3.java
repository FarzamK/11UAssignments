    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        //change karels color
        karel.setColor(Color.BLUE);

        //create counter for things
        kw.showThingCounts(true);

        // make karel plant his crops 

        for (int moveCount= 0; moveCount< 16; moveCount= moveCount+ 1) {
            karel.putThing();
            karel.move();


            if (moveCount == 3 || moveCount == 7 || moveCount == 11 || moveCount == 15) {
                karel.putThing();
            }
            if (moveCount == 3 || moveCount == 7 || moveCount == 11 || moveCount == 15) {
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.move();
                karel.move();
                karel.move();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }

        }



    }
}


