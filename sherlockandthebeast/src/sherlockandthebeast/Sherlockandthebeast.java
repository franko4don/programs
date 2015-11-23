/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandthebeast;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandthebeast {
    static int a,b,T,t;
    static Vector v;
    static String str;
    static int[]answers;
    static String five="5";
    static String three="3";
    static enum ant{};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt(); v=new Vector();
         answers=new int[T]; 
         String []vec=new String[T];
         
         int N;
         for(int e=0; e<T; e++){
         answers[e]=sc.nextInt();
         }
        for(t=0; t<T; t++){
           N=answers[t];
            if(N<3||N==4||N==7){
            System.out.print(-1);
            System.out.println("");
            continue;
            }
            if(N==5){
            System.out.print(repeat("3",N));
            System.out.println("");
            continue;
            }
            if(N%3==0){
           System.out.print(repeat("5",N));
            System.out.println("");
            continue;
            }
            if(N%3!=0){
            a=N;
            b=0;
            int c=a%3;
            int d=b%5;
            while((c+d)!=0){
            a-=1; b+=1;
            c=a%3; d=b%5;
            }
            }
           System.out.print(repeat("5",a));
         System.out.print(repeat("3",b));
           System.out.println("");
        }
    }
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
    }

