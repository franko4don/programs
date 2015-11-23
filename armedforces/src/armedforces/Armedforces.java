/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package armedforces;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Armedforces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int a=sc.nextInt();
       int b=sc.nextInt();
       int add=0;
       for(int j=a; j<=b; j++){
       String input=""+j;
       char process[]=input.toCharArray();
       add+=combat(process);
       }
       System.out.println(add);
    
       }
    }
    
    public static int combat(char[] stream){
    int count=0;
    for(int j=1; j<8; j++){
    int sum=0;
    for(int k=0; k<stream.length; k++){
    sum+=((int)Math.pow(Character.getNumericValue(stream[k]), j));
    }
    if(new BigInteger(""+sum).isProbablePrime(9)){
    count++;
    }else{
    return count;
    }
    }
    if(count>6)return -1;
    
    return 0;
    }
}
