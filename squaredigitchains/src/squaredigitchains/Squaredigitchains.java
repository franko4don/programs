/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredigitchains;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Squaredigitchains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
        hm1.put(44,44);
        hm1.put(32,32);
        hm1.put(13,13);
        hm1.put(10,10);
        hm1.put(1,1);
        hm2.put(85,85);
        hm2.put(89,89);
        hm2.put(145,145);
        hm2.put(20,20);
        hm2.put(4,4);
        hm2.put(16,16);
        hm2.put(37,37);
        hm2.put(58,58);
        hm2.put(42,42);
        int number[]=new int[]{0,1,4,9,16,25,36,49,64,81,100};
        int t=sc.nextInt();
        int N=(int)Math.pow(10, t);
        int count=0;
        for(int i=0; i<=N; i++){
        String get=i+"";
        for(int k=0; k<20000; k++){
        int temp=0;
        for(int j=0; j<get.length(); j++){
        temp+=number[Character.getNumericValue(get.charAt(j))];
        }
        get=temp+"";
        if(hm1.containsKey(temp)){
       // hm1.put(k,k );
        break;
        }
        if(hm2.containsKey(temp)){
       // hm2.put(k,k );
        count++;
        break;
        }
        }
        }
        System.out.println(count);
        //8581146 85744333
    }
}
