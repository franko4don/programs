/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package easymath;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Easymath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger start=new BigInteger("1");
        BigInteger times4=new BigInteger("4");
        BigInteger ten=new BigInteger("10");
        BigInteger times=new BigInteger("4");
        HashSet numbers=new HashSet();
        for(int i=0; i<5000; i++){
        BigInteger ans1=start.multiply(times4);
        start=start.multiply(ten);
        BigInteger ans2=start.multiply(times4);
        start=start.add(BigInteger.ONE);
        times=times.multiply(ten);
        numbers.add(ans1);
        numbers.add(ans2);
        numbers.add(times);
        }
        Object []sort=numbers.toArray();
        Arrays.sort(sort);
        
        int T=sc.nextInt();
        for(int j=0; j<T; j++){
        int N=sc.nextInt();
        BigInteger begin=new BigInteger(Integer.toString(N));
        String get="";
        int four=0;
        int zero=0;
        for(int k=0; k<sort.length; k++){
        BigInteger sub=new BigInteger(sort[k].toString());
        if(sub.mod(begin).toString().equals("0")){
        get=sub.toString();
        break;
        }
        }
        for(int l=0; l<get.length(); l++){
        if(get.charAt(l)=='4'){
        four++;
        }else{
        zero++;
        }
        }
        long answer=(2*four)+zero;
        System.out.println(answer);
        }
    }
}
