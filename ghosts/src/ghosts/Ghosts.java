/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghosts;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Ghosts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int C=sc.nextInt();
       int D=sc.nextInt();
       int count=0;
       for(int i=1; i<=A; i++){
       for(int j=1; j<=B; j++){   
       for(int k=1; k<=C; k++){
       for(int l=1; l<=D; l++){        
       int case1=Math.abs(i-j)%3;
       int case2=(j+k)%5;
       int case3=(i*k)%4;
       int case4=gcd(i,l);
       if(case1==0&&case2==0&&case3==0&&case4==1){
           count++;
       System.out.println(i+" "+j+" "+k+" "+l);
       }
    }
       }
       }
       }
       System.out.println(count);
    }
    
    public static int gcd(int x,int y){
   if(y==0){
   return x;
   }else{
   return gcd(y,x%y);
   }
   }
}
