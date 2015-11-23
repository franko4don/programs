/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nestorjava;

import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Nestorjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // am about to get prime numbers can only be divided by one and itself
       
       
        if(isPrime(804509)){
        System.out.print("I AM A PRIME");
       }else{
        System.out.print("I AM NOT PRIME");
       }
    }
    
 private static boolean isPrime(int x){
  //11 and !15 67---------11*17 
     boolean captured=false;
     for(int p=2; p<11; p++){
     if(x%p==0){
   captured=false; 
     }else{    
  String str=Double.toString(Math.sqrt(x));
  if(str.charAt(str.indexOf(".")+1)=='0'){
  captured=false;
  }else{
  captured=true;
  }
     }
     }
     if(captured==true){
     return true;
     }else{
     return false;
     }
 
 }
}
