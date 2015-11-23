/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightingbulbs;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Lightingbulbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long high=0;
        long chain=0;
        for(long i=1; i<=6000000; i++){
        long number=i;
        long count=0;
        while(number>1){
        if(number%2==0){
        number/=2;
        count++;
        }else{
        number=(3*number)+1;
        count++;
        }
        }
        if(count>=chain){
        chain=count;
        high=i;
        System.out.print(high+",");
        }
       
        }
         
        }
}
