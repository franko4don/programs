/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marblecut;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Marblecut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long l=sc.nextLong();
        long b=sc.nextLong();
        long times=l*b;
        double ans1=times/3.0;
        if(ans1%1==0){
        System.out.println("YES");
        }else{
        long ans2=times%3;
        System.out.println("NO "+ans2);
        }
        }
    }
}
