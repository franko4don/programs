/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dayaandhistree;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Dayaandhistree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector <Long>v=new Vector<Long>();
        HashMap <Long,Long>hm=new HashMap<Long,Long>();
        BigInteger three=new BigInteger("3");
        long sum=0;
        for(long m=3; m<56; m++){
        long ans=0;
        long temp=3;
        while(temp<=m){
         
        BigInteger one=factorial(temp-1);
        BigInteger two=factorialspeed(m-1,m-temp-2);
        ans+=two.divide(one).longValue();
        temp+=3;
        }
        
        sum+=ans;
        hm.put((long)Math.pow(2, m),sum);
        v.addElement((long)Math.pow(2, m));
        System.out.println(ans);
        }
        
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextInt();
        long get=0;
        for(int j=0; j<v.size(); j++){
        if(v.elementAt(j)>=N){
        get=v.elementAt(j);
        break;
        }
        }
        long grab=hm.get(get);
        for(long k=get; k>=N; k--){
        BigInteger bi=new BigInteger(Long.toBinaryString(k));
        if(bi.mod(three).signum()==0){
        grab--;
        }
        }
        System.out.println(grab-1);
        }
        
    }
    public static BigInteger factorial(long n){
    BigInteger calc=new BigInteger("1");
    for(long i=n; i>0; i--){
    calc=calc.multiply(new BigInteger(Long.toString(i)));
    }
    return calc;
    }
    
    public static BigInteger factorialspeed(long n,long m){
    BigInteger calc=new BigInteger("1");
    for(long i=n; i>m; i--){
    calc=calc.multiply(new BigInteger(Long.toString(i)));
    }
    return calc;
    }
}
