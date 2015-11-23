/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Utils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        StringBuilder strb=new StringBuilder();
        int T=sc.nextInt();
        String sb="";
        int slice=0;
        int j;
        int[]slices=new int[T];
        String values=sc.nextLine();
        
             for(int i=0; i<T; i++){
             String remaining=values;
             System.out.println(remaining);
            for(j=0; j<remaining.length(); j++){
            char c=remaining.charAt(j);
            if(c==' '){
            continue;
            }
            if(Character.isDigit(c)){
            slice=Character.getNumericValue(c);
            continue;
            }
            if(c==','){break;
            }
            sb+=c;
            }
           // values="";
         // values=remaining.substring(j,remaining.length());
            System.out.println(slice);
          sb="";
        }
        
             }
}
