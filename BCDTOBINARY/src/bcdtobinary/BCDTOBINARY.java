/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcdtobinary;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class BCDTOBINARY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      System.out.println(Converter(55));
      System.out.println(Integer.toBinaryString(Converter(55)));
    }
    
    public static int Converter(int a){
   int temp=0; int ans=0;
   while(a!=1){
   temp=a%2;
   a/=2;
   if(temp==1){
   ans=ans^1;
   ans=ans<<1;
   
   }else{
   ans=ans<<1;
   }
   System.out.println(a+"   "+Integer.toBinaryString(ans)+"   "+temp);
   }
   
   return ans;
    }
    
       public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
