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
public class ArrayManipulation {
    public static void main(String[] args) {
        int length = 5;
        double[] initvalues = new double[length];
        for (int i = 0; i < length; i++){
            initvalues[i] = i * i;
        }
        
        MyVector vec = new MyVector(initvalues);
        MyVector vecTwo = new MyVector(vec);
        System.out.print(vec.toString());
        System.out.println("");
        System.out.print(vecTwo);
        System.out.println("");
        System.out.print(vec.plus(vecTwo).toString());
    }
    
}
