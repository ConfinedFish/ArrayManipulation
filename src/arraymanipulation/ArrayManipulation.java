/**
* Project: Project1                                                     
* Author: ? (fill in your account name)                        
* Creation date: mm/dd/yyyy                                    
* Completion time: ? hours (fill in the time it took you       
* to write the program)                                        
*                                                              
* Honor Code: I pledge that this program represents my         
*   own program code. I received help from (fill in the name)  
*   in designing and debugging my program.                     
*/
package arraymanipulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        MyVector vector1 = printMessage(1);
        MyVector vector2 = printMessage(2);
        print("Vector 1: " + vector1.toString());
        println("");
        print("Vector 2: " + vector2.toString());
        println("");
        print("Addition: ");
        println("");
        print(vector1.plus(vector2));
        
    }
    private static MyVector printMessage(int numArray){
        print("Please enter a length of an Array (" + numArray + "/2): ");
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int length = 0, count, input = 0;
        while (!valid){
            try{length = scan.nextInt(); valid = true;}
            catch(InputMismatchException e){
                print("Invalid Input.");
                scan.next();
                valid = false;
            }
        }
        double[] initvalues2 = new double[length];
        count = 0;
        valid = false;
        while (count < length){
            print("Enter a value (" + (count + 1) + "/" + length + "): ");
            while (!valid){
                try{input = scan.nextInt(); valid = true;}
                catch(InputMismatchException e){
                    print("Invalid Input.");
                    scan.next();
                    valid = false;
                }
            }
            valid = false;
            initvalues2[count] = input;
            count++;
        }
        return new MyVector(initvalues2);
    }
    private static void print(Object obj){
        System.out.print(obj);
    }
    private static void println(Object obj){
        System.out.println(obj);
    }
}
