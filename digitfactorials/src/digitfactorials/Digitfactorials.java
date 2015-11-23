/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitfactorials;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Digitfactorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();  
        Vector v=new Vector();
        for(int i=10; i<N; i++){
        int sum=0;
        String compute=Integer.toString(i);
        for(int j=0; j<compute.length(); j++){
        long value=Long.parseLong(String.valueOf(compute.charAt(j)));
        int calc=1;
        for(int k=0; k<value; k++){
        calc*=value-k;
        }
        sum+=calc;
        }
        if(sum%i==0){
        v.addElement(i);
        }
        }
        int add=0;
        for(int l=0; l<v.size(); l++){
        add+=Integer.parseInt(v.elementAt(l).toString());
        }
        System.out.println(add);
    }
}
