/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diehard3;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Diehard3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(c==b||c==a){
        System.out.println("YES");
        continue;
        }
        if(c>a&&c>b){
        System.out.println("NO");
        continue;
        }
        }
    }
}
