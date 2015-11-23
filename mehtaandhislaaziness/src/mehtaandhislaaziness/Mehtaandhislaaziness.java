/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mehtaandhislaaziness;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Mehtaandhislaaziness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int number[]=new int[1000001];
       int proper[]=new int[1000001];
       for(int i=1; i<number.length; i++){
       for(int j=i; j<number.length; j+=i){
       proper[j]+=1;
       }
       }
       Vector<Integer>v=new Vector<Integer>();
       for(int i=2; i<=1000; i+=2){
       v.addElement(i*i);
       }
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       int count=0;
       for(int j=0; j<v.size(); j++){
       if(v.elementAt(j)>N/2){
       break;
       }
       if(N%v.elementAt(j)==0){
       count++;
       }
       }
       
       if(count==0){
       System.out.println(0);
       }else{
       int gcd=gcd(proper[N]-1,count);
       System.out.println((count/gcd)+"/"+((proper[N]-1)/gcd));
       }
       }
       
    }
   public static int gcd(int x,int y){
   if(y==0){
   return x;
   }else{
   return gcd(y,x%y);
   }
   }
}
