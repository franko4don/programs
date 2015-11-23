/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ndigitfibonacci;

import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Ndigitfibonacci {

    /**
     * @param args the command line arguments
     */
    
    
      public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        double phi=1.618033989;
        double five=Math.sqrt(5);
        HashMap hm=new HashMap();
        int l=1;
        for(int i=1; i<24927; i++){
        double ans=i*Math.log10(phi)-Math.log10(Math.sqrt(5));        
        int digit=(int)ans+1;
        if(digit==l){  
        hm.put(digit, i);
        l++;
        }
        }
        int T=sc.nextInt();
        for(int j=0; j<T; j++){
        int N=sc.nextInt();
        System.out.println(hm.get(N));
        }       
}
}
