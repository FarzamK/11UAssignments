package Assignment6;

import java.util.Scanner;

/**
 *
 * @author kathf6052
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        int integer = input.nextInt();
        // create an array for the number
        int[] numbers = new int[1001];
        // create an arary of booleans
        boolean[] PorC = new boolean[1001];
        // make p = 2
        int p = 2;
        // create a for loop to let all the booleans true
        for (int x = 0; x < PorC.length; x++) {
            PorC[x] = true;
        }

        // for loop to make all the numbers equal themselves
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        
        PorC[2] = true;
        for (int y = 2; y < 1001; y++) {
            for (int z = 2 * p; z < 1001; z = z + p) {
                PorC[z] = false;
                for (int m = p; m < 1001; m++) {
                    if (p < 1000) {
                        p = p + 1;
                    }
                    if (PorC[p] == true) {
                        break;
                    }
                }
            }

        }
        // tell the user if the number is prime or composite
        if(PorC[integer] == true){
            System.out.println("The number you inputted is prime");
        }else{
            System.out.println("The number you entered is composite");
        }
    }

}
