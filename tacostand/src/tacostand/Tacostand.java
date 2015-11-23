/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tacostand;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Tacostand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long s=sc.nextLong();
        long m=sc.nextLong();
        long r=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(taco(s,m,r,b));
        }
    }
    
    public static long taco(long tacos,long meat,long rice,long beans){
    long value[]=new long[]{meat,rice,beans};
    Arrays.sort(value);
    if(tacos==0||(meat==0&&rice==0)||(meat==0&&beans==0)||(beans==0&&rice==0)){
    return 0;
    }
    long highest=value[1];
    long remain=value[2]-value[1];
    if(remain<=value[0]){
    highest+=remain;
    }else{
    highest+=value[0];
    }
    if(highest>=tacos){
    return tacos;
    }else{
    return highest;
    }
    
    }
}
