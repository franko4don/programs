/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package halloween;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Halloween {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(); 
        long k;
        long[]values=new long[T];
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        k=sc.nextLong(); 
        values[i]=k;
        }
        for(int j=0; j<values.length; j++){
        if(values[j]%2==0){
          long number1=(values[j]/2);
          long number2=(values[j]/2);
          long first=number1*number2;
         v.addElement(first);
        }
        else{
        long number1=((values[j]/2)+1);
        long number2= ((values[j]/2));
        long second=number1*number2;
        v.addElement(second);
        }
        }
        for(int m=0; m<v.size(); m++){
        System.out.println(v.elementAt(m));
        }
    }
}
