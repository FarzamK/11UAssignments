/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner promCost = new Scanner(System.in);
        Scanner djCost = new Scanner(System.in);
        Scanner rentCost = new Scanner(System.in);
        Scanner decCost = new Scanner(System.in);
        Scanner staffCost = new Scanner(System.in);
        Scanner miscCost = new Scanner(System.in);
        
        System.out.println("How much does the food for prom cost?");
        int prom = promCost.nextInt();
        
        System.out.println("How much does the DJ cost?");
        int dj = djCost.nextInt();
        
        System.out.println("How much does it cost to rent the hall");
        int rent = rentCost.nextInt();
        
        System.out.println("How much does decoration cost?");
        int dec = decCost.nextInt();
        
        System.out.println("How much does it cost for staff?");
        int staff = staffCost.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        int misc = miscCost.nextInt();
        
        
        int totalCost = prom + dj + rent + dec + staff + misc;
        
        int totalTickets = (int)Math.ceil(totalCost/35.0);
        
        System.out.println("The total cost is $" + totalCost + ". You will need to sell " + totalTickets + " tickets to break even.");
    }
}
