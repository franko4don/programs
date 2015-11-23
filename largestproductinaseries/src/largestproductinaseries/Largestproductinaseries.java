/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largestproductinaseries;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Largestproductinaseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){   
        int highest=0;
        int N=sc.nextInt();
        int K=sc.nextInt();  
        String compute=sc.next();
        for(int j=0; j<N-K; j++){
        int multiply=1;
        String sub=compute.substring(j,K+j);
        for(int k=0; k<sub.length(); k++){
        long value=Long.parseLong(String.valueOf(sub.charAt(k)));
        multiply*=value;
        }
        if(multiply>highest){
        highest=multiply;
        }
        }
        v.addElement(highest);
        }
        for(int l=0; l<v.size(); l++){
        System.out.println(v.elementAt(l));
        }      
    }
}
