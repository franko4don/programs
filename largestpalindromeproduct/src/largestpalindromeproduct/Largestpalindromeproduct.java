/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largestpalindromeproduct;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Largestpalindromeproduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        long com=0;
        long N=sc.nextLong();
        for(long j=N; j>=0; j--){
        StringBuilder sb=new StringBuilder();
        sb.append(j);
        String test1=sb.toString();
        String test2=sb.reverse().toString();
        if(test1.equals(test2)){
        for(int k=100; k<1000; k++){       
        long get=j/k;
        if(Long.toString(get).length()==3&&j%k==0){
        v.addElement(j);
        com=j;
        break;
        }
        }
        }
        if(com==j){
        break;
        }
        }
    }
        for(int l=0; l<v.size(); l++){
        System.out.println(v.elementAt(l));
        }
    }
}
