/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timeinwords;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Timeinwords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int H=sc.nextInt();
       int M=sc.nextInt();
       if(H>12){
       H-=12;
       }
       String tens[]=new String[]{"0","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
       if(H==12){
       if(M>30){
       int m=60-M;
       System.out.println(tens[m]+" minutes to "+tens[1]);
       System.exit(0);
       }
       if(M<30){
       System.out.println(tens[M]+" minutes past "+tens[H]);
       System.exit(0);
       }
       }
       if(M==30){
       System.out.println("half past "+tens[H]);
       System.exit(0);
       }
       if(M==45){
       System.out.println("quarter to "+tens[H+1]);
       System.exit(0);
       }
       if(M==15){
       System.out.println("quarter past "+tens[H]);
       System.exit(0);
       }
       if(M==0){
       System.out.println(tens[H]+" o' clock");
       System.exit(0);
       }
       if(M>30){
       int m=60-M;
       System.out.println(tens[m]+" minutes to "+tens[H+1]);
       System.exit(0);
       }
       if(M<30){
       System.out.println(tens[M]+" minutes past "+tens[H]);
       System.exit(0);
       }
    }
}
