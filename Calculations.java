//This program is about calculations in java basic ones.

/* Date:- 25-09-2021
Group members:- Vinit Jangir, Ujjwal Sood, Jay D, Anthony R
 */
package Assignment_three;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st value:-    ");
        int A = input.nextInt();
        System.out.println("enter 2nd value:-    ");
        int B = input.nextInt();
        System.out.println("addition: " + (A+B));
        System.out.println("subtraction: " + (A-B));
        System.out.println("multiplication: " + (A*B));
        System.out.println("division: " + (A/B));
        System.out.println("modulus: " + (A%B));
        System.out.println("your name:-   ");
        String X = input.next();
        System.out.println(X);
        input.close();

    }

}
