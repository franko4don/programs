/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.squares;
import java.math.*;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class SherlockAndSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(); //number of test cases
        long values[]=new long[T];
        for(int i=0; i<T; i++){
        long a=sc.nextInt(); //first index
        long b=sc.nextInt();  //second index
        double ans1=Math.sqrt(a-1); //squareroot of the first index
        double ans2=Math.sqrt(b);   //squareroot of the second index
        long first=(long)ans1;     //takes the integer part of ans1
        long second=(long)ans2;    //takes the integer part of ans2
        long Integer=second-first; //subtracts the first from the second
        values[i]=Integer;   //adds answer to the array
    }
        for(int j=0; j<values.length; j++){
        System.out.println(values[j]); //prints out the answers from the array
        }
    }
}
