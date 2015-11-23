/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationofnaturalnumbers;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Permutationofnaturalnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String main=sc.next();
       int length=main.length()+1;
       Vector<Integer> v=new Vector<Integer>();
       int get[]=new int[length];
       for(int i=0; i<length; i++){
       get[i]=i+1;
       }
       v.addElement(get[0]);
       int k=0;
       for(int j=get.length-1; j>=1; j--,k++){
           int number=get[j];
           if(main.charAt(k)=='I'){  
             v.add(0,number);
                     
           }else{
           
            v.addElement(number);
           }
       }
       StringBuilder sb=new StringBuilder();
       for(int m=0; m<v.size(); m++){
       sb.append(v.elementAt(m)+" ");            
       }
       System.out.println(sb.toString().trim());
    }
}
