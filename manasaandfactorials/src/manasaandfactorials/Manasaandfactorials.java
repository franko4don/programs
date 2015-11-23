/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manasaandfactorials;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Manasaandfactorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector <Long>v=new Vector<Long>();
        long test=0;
        int p=1;
        while(test<50000000000000000L){
        test=(long)Math.pow(5,p);
        v.addElement(test);
        p++;
        }
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        long first=N*5;
        for(long j=first; j>0; j-=5){
        int m=0;
        long sum=0;
        while(v.elementAt(m)<=j){
        sum+=(j/v.elementAt(m));
        m++;
        }
        if(sum<N){
        System.out.println(j+5);
        break;
        }
        if(sum==N){
        System.out.println(j);
        break;
        }
        
        }
        
        
        }
    
    }
}
