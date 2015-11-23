/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncr;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Ncr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Long,Long> hm=new HashMap<Long,Long>();
        long times=1;
        for(long i=1; i<=142857; i++){
        hm.put(i,times);
        times=(times*i)%142857;
        }
        System.out.println(hm);
        int T=sc.nextInt();
        for(int j=0; j<T; j++){
        long n=sc.nextLong()%142857;
        long r=sc.nextLong()%142857;
        long get=n-r;
        if(r==0){
        System.out.println(1);
        continue;
        }
        long first=hm.get(n);
        long second=hm.get(get);
        long third=hm.get(r);
        System.out.println(first/(second*third));
        }
    }
}
