/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finddigits;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Finddigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int count=0;
        int values[]=new int[T];
        for(int i=0; i<T; i++){
        int first=sc.nextInt();
        String index=Integer.toString(first); //converts the long value "first" to string
        for(int j=0; j<index.length(); j++){
        int divisor=Integer.parseInt(String.valueOf(index.charAt(j))); 
        //gets each character in a string as a string and converts it to long
        if(divisor==0){continue;}
        int remainder=first%divisor; //gets the remainder from the division first by the long value "division"
        if(remainder==0){
        count+=1;  //increments count if condition is satisfied
        }
        }
        values[i]=count; //adds the number of counts to the array
        count=0;     //resets count to zero
        }
        for(int k=0; k<values.length; k++){
        System.out.println(values[k]); //prints out the values
    }
    }
}
