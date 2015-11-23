/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largestexponential;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Largestexponential {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double first[]=new double[N];
        HashMap <Double,String>hm=new HashMap<Double,String>();
        for(int i=0; i<N; i++){
        long one=sc.nextLong();
        long two=sc.nextLong();
        double ans=two*Math.log10(one);
        first[i]=ans;
        hm.put(ans, ""+one+" "+two);
        }
        int K=sc.nextInt();
        Arrays.sort(first);
        System.out.println(hm.get(first[K-1]));
    }
}
