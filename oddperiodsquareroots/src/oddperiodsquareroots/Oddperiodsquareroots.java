/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddperiodsquareroots;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Oddperiodsquareroots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int answer=0;
        for(int i=1; i<=N; i++){
        if(Math.sqrt(i)%1==0){
        continue;
        }
        int m0=0;
        int d0=1;
        int a0=(int)Math.sqrt(i);
        int count=0;
        for(int j=0; j<20000; j++){ 
        m0=(d0*a0)-m0;
        d0=(i-(m0*m0))/d0;
        a0=((int)Math.sqrt(i)+m0)/d0;
        count++;
        if(a0==(2*(int)Math.sqrt(i))){
        break;
        }
        }
        if(count%2!=0){
        answer++;
        }
        }
        System.out.println(answer);
        
    }
}
