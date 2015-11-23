/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangularpentagonalhexagonal;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Triangularpentagonalhexagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        int first=sc.nextInt();
        int second=sc.nextInt();
        if(first==3&&second==5){
        for(long i=1; i<=N; i++){
        long tri=(i*(i+1))/2;
        if(tri>=N){
        break;
        }
        double firstroot=((1)+(Math.sqrt(1+(4*3*2*tri))))/6;
        double secondroot=((1)-(Math.sqrt(1+(4*3*2*tri))))/6;
        if(firstroot%1==0&&firstroot>=0||secondroot%1==0&&secondroot>=0){
        System.out.println(tri);
        }
        }
        }
        if(first==5&&second==6){
        for(long i=1; i<=N; i++){
        long pent=i*(((3*i)-1)/2);
        if(pent>=N){
        break;
        }
        double firstroot=((1)+(Math.sqrt(1+(4*2*pent))))/4;
        double secondroot=((1)-(Math.sqrt(1+(4*2*pent))))/4;
        if(firstroot%1==0&&firstroot>=0||secondroot%1==0&&secondroot>=0){
        System.out.println(pent);
        }
        }
        }
    }
}
