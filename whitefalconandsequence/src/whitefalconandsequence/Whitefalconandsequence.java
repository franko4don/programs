/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whitefalconandsequence;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Whitefalconandsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long factorials[]=new long[]{1,1,2,6,24,120,720,5040,40320,362880};
        for(long i=196; i<=196; i++){
       HashMap <Long,Long>hm=new HashMap<Long,Long>();
       long number=i;
       long count=0;
       for(int m=0; m<60; m++){
       long sum=0;
       char[]operate=(""+number).toCharArray();
       for(int j=0; j<operate.length; j++){
       sum+=factorials[Character.getNumericValue(operate[j])];
       }
       if(hm.containsKey(number)){
       break;
       }
       hm.put(number, number);
       number=sum;
       count++;
       
       
       }
       System.out.println(count);
    }
}
}
