/*  A test class to test the BigInt class  */

import java.util.Scanner;

public class BigIntTester
{
    public static void main (String [] args)
    {
        Scanner kboard = new Scanner (System.in);
        
        // Test the integer-based constructor  (also testing toString() )
        System.out.println ("Testing the conversion of an int to a BigInt");
        System.out.print   ("Please enter a standard (positive) integer: ");
        int n = kboard.nextInt();
        BigInt bigInt1 = new BigInt(n);
        System.out.println ("Converted to a BigInt: " + bigInt1);
        System.out.println ("\n\n");
        
        kboard.nextLine();    // finish the end of the previous input
        
        // Test the String-based constructor  (also testing toString() )
        System.out.println ("Testing the conversion of a String to a BigInt");
        System.out.print   ("Please enter a really long positive integer: ");
        String str = kboard.nextLine();
        BigInt bigInt2 = new BigInt(str);
        System.out.println ("Converted to a BigInt:                       " + bigInt2);
        System.out.println ("\n\n");
        
        // Test multiplication with powers of 10
        System.out.println ("Testing multiplication with powers of ten.");
        System.out.println ("Comparing a standard integer to a BigInt");
        n = 1;
        BigInt bigInt3 = new BigInt(1);
        for (int i = 1; i <= 50; i++)
        {
            bigInt3.multiply(10);
            n *= 10;
            System.out.println ("10^" + i + " = " + n + "\t\t" + bigInt3);
        }
        System.out.println ("\n\n");
        
        // Test multiplication with factorial
        System.out.println ("Testing multiplication with factorial.");
        System.out.println ("Comparing a standard integer to a BigInt");
        n = 1;
        BigInt bigInt4 = new BigInt(1);
        for (int i = 1; i <= 50; i++)
        {
            bigInt4.multiply(i);
            n *= i;
            System.out.println (i + "! = " + n + "\t\t" + bigInt4);
        }
        System.out.println ("\n\n");
        
        
        
        kboard.close();
    }
}