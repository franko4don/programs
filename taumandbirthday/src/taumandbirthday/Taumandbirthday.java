/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taumandbirthday;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Taumandbirthday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long B=sc.nextLong();
        long W=sc.nextLong();
        long X=sc.nextLong();
        long Y=sc.nextLong();
        long Z=sc.nextLong();
        long priceB=B*X;
        long priceW=W*Y;
        long temp=0;
        long low=priceB+priceW;
        if(Z>=X&&Z>=Y){
        System.out.println(priceB+priceW);
        continue;
        }
        if(X>Y){
        temp=Y;
        }else{
        temp=X;
        }
        if(temp==X){
        for(long a=W; a>=0; a--){
        long times=Z*a;
        long check1=(B+a)*X;
        long check2=(W-a)*Y;
        if(check2<0){
        break;
        }
        long answer=times+check1+check2;
        if(answer<=low){
        low=answer;
        }
        if(answer>low){
        break;
        }
        }
        System.out.println(low);
        }else{
        for(long a=B; a>=0; a--){
        long times=Z*a;
        long check1=(a+W)*Y;
        long check2=(B-a)*X;
        if(check2<0){
        break;
        }
        long answer=times+check1+check2;
        if(answer<=low){
        low=answer;
        }
        if(answer>low){
         break;
        }
        }
        System.out.println(low);
        }
        }
    }
}
