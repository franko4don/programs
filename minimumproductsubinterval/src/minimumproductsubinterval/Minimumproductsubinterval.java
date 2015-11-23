/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumproductsubinterval;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.*;
import java.util.StringTokenizer;
import java.util.regex.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */


public class Minimumproductsubinterval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int actual[]=new int[3];
       int expected[]=new int[3];
       for(int i=0; i<3; i++){
       actual[i]=sc.nextInt();
       }
       for(int i=0; i<3; i++){
       expected[i]=sc.nextInt();
       }
      
       if(actual[2]-expected[2]>0){
       System.out.println(10000);
       System.exit(0);
       }
       if(actual[1]-expected[1]>0){
       int amount=500*(actual[1]-expected[1]);
       System.out.println(amount);
       System.exit(0);
       }
       
       if(actual[0]-expected[0]>0){
       int amount=15*(actual[0]-expected[0]);
       System.out.println(amount);
       System.exit(0);
       }
       
    }
        
    }
