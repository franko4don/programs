/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kaprekarnumber;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Kaprekarnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long p=sc.nextLong();
       long q=sc.nextLong();
       long first;
       long second;
       StringBuilder sb=new StringBuilder();
       for(long i=p; i<=q; i++){
       if(i==2||i==3){
       continue;
       }
       if(i==1){
       sb.append(i).append(" ");
       continue;
       }
       long check=i*i;
       
       String operate=Long.toString(check);
       int length=Long.toString(check).length();
       first=Long.parseLong(operate.substring(0, length/2));
       second=Long.parseLong(operate.substring(length/2, length));
       long ans=first+second;
       if(ans==i){
       sb.append(i+" ");
       }
       }
       if(!sb.toString().equals("")){
       System.out.println(sb.toString().trim());
       }else{
       System.out.println("INVALID RANGE");
       }
    }
}
