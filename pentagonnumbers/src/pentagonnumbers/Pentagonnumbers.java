  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagonnumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pentagonnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Long,Long> hm=new HashMap<Long,Long>();
        for(long i=1; i<1000000; i++){
        long n=i;
        long pent=(n*((3*n)-1))/2;
        hm.put(i,pent);
        }
        int N=sc.nextInt();
        int K=sc.nextInt();
        int test=(N-(K+1));
        for(long i=0; i<test; i++){
        long first=hm.get(i+1+K)+hm.get(i+1);
        long second=hm.get(i+1+K)-hm.get(i+1);
        double a1=((1)+(Math.sqrt(1+(4*3*2*first))))/6;
        double a2=((1)-(Math.sqrt(1+(4*3*2*first))))/6;
        double b1=((1)+(Math.sqrt(1+(4*3*2*second))))/6;
        double b2=((1)-(Math.sqrt(1+(4*3*2*second))))/6;
        if((long)a1>0&&a1%1==0||(long)a2>0&&a2%1==0||(long)b1>0&&b1%1==0||(long)b2>0&&b2%1==0){
        System.out.println(hm.get(i+1+K));
        }
        }
    }
    
}
