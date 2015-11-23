/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsort;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Testsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int T=sc.nextInt();
        long []test=new long[T];
        for(int k=0; k<T; k++){
        test[k]=sc.nextLong();
        }
        
        for(int i=0; i<T; i++){
        if(Long.toString(test[i]).length()<2){
        System.out.println(test[i]);
        continue;
        }
        long first=test[i];
        for(int j=1; j<999999999999999999L; j++){
        first+=1;
        String comp=Long.toString(first);
        StringBuilder sb=new StringBuilder();
        String reverse=sb.append(first).reverse().toString();
        if(comp.equals(reverse)){
            break;
        }
        
        }
        System.out.println(first);
        }
    }
}
