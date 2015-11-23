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
      int get=Converter(55);
      System.out.println(get);
   //   System.out.println(Integer.toBinaryString(55));
    //   System.out.println(Integer.toBinaryString(swapnibble(get)));
       System.out.println(Integer.reverseBytes(get));
    }
    
    public static int Converter(int a){
   int temp; int ans=0;
   while(a!=0){
   temp=a%2;
   a/=2;
   if(temp==1){
   ans=ans^1;
   ans<<=1;
   }else{
   ans<<=1;
   }
   System.out.println(a+"   "+Integer.toBinaryString(ans)+"   "+temp);
   }
  // int length=Integer.toBinaryString(ans).length();
   return ans;
    }
    
    
    public static int swapnibble(int answer){
    int y=answer; int r=answer;
    r&=0x0F;
    System.out.println(Integer.toBinaryString(r));
    r<<=3;
    System.out.println(Integer.toBinaryString(r)+"  left shift r");
    y&=0xF0;
    System.out.println(Integer.toBinaryString(y));
    y>>=4;
    System.out.println(Integer.toBinaryString(y)+"  left shift y");
    answer=r^y;
        return answer;
    }
       public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
