/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testmultiple;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Testmultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long []numbers=new long[40];
        Vector v=new Vector();
        for(int i=0; i<40; i++){
        numbers[i]=i+1;
        }
        //System.out.println(Arrays.toString(numbers));
        long time=1;
        for(int j=0; j<40; j++){
         long k=numbers[j];        
        if(time%k==0){
         v.addElement(time); 
        }else{
         long small=9999;
        for(int l=1; l<j; l++){
        if(k%numbers[l]==0&&numbers[l]<small){
        small=numbers[l];       
        }
        }
        if(small!=9999){
        time*=small;
        v.addElement(time);
        }else{
        time*=k;
        v.addElement(time);
        }
        }
        }
        System.out.println(v);
    }
}
