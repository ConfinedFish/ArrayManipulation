/*
* Project: Project1                                                     
* Author: Alex Zeigler
* Creation date: 09/27/18
* Completion time: 3 hours
*                                                              
* Honor Code: I pledge that this program represents my         
*   own program code.
*/
package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulation {
    /**
     * Main method.
     * @param args args
     */
    public static void main(String[] args) {
        MyVector vector1 = printMessage(1);
        MyVector vector2 = printMessage(2);
        print("Vector 1: " + vector1.toString());
        println("");
        print("Absolute Value: ");
        print(vector1.abs());
        println("");
        print("Scaled By 4: ");
        print(vector1.scaleBy(4));
        println("");
        println("------------");
        println("");
        print("Vector 2: " + vector2.toString());
        println("");
        print("Absolute Value: ");
        print(vector2.abs());
        println("");
        print("Scaled By 4: ");
        print(vector2.scaleBy(4));
        println("");
        println("------------");
        println("");
        print("Addition: ");
        try{print(vector1.plus(vector2).toString());}
        catch(Exception e){
            print("Array Lengths Unequal");
        }
        println("");
        print("Subtraction: ");
        try{print(vector1.minus(vector2).toString());}
        catch(Exception e){
            print("Array Lengths Unequal");
        }
        println("");
        print("Dot Product: ");
        print(vector1.dotProduct(vector2));

    }

    /**
     * Asks the user for input of the length of the array and asks for the values of the array.
     * Checks if the value is a double, and will continue to ask until a double is received.
     * @param numArray - value to keep track of how many values have been made.
     * @return a complete MyVector object.
     */
    private static MyVector printMessage(int numArray){
        print("Please enter a length of an Array (" + numArray + "/2): ");
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int length = 0;
        while (!valid){
            try{length = scan.nextInt(); valid = true;}
            catch(InputMismatchException e){
                print("Invalid Input.");
                scan.next();
                valid = false;
            }
        }
        double[] initvalues = new double[length];
        int count =0;
        double input = 0;
        valid = false;
        while (count < length){
            print("Enter a value (" + (count + 1) + "/" + length + "): ");
            while (!valid){
                try{input = scan.nextDouble(); valid = true;}
                catch(InputMismatchException e){
                    print("Invalid Input.");
                    scan.next();
                    valid = false;
                }
            }
            valid = false;
            initvalues[count] = input;
            count++;
        }
        return new MyVector(initvalues);
    }

    /**
     * Shortcut to the print method.
     * @param obj - object to print
     */
    private static void print(Object obj){
        System.out.print(obj);
    }
    /**
     * Shortcut to the println method.
     * @param obj - object to print
     */
    private static void println(Object obj){
        System.out.println(obj);
    }
}
