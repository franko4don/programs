/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfunctioncalculation;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Stringfunctioncalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        HashMap<String,Long>hm=new HashMap<String,Long>();
        hm.put(input, 1L);
        for(int i=1; i<input.length(); i++){       
        for(int j=0; j<=input.length()-i; j++){
        String test=input.substring(j,j+i);
        if(hm.containsKey(test)){
        long key=hm.get(test)+1;
        hm.put(test, key);
        }else{
        hm.put(test, 1L);
        }       
        }
        }
        long high=0;
        Set st=hm.keySet();
        Iterator<String>it=st.iterator();
        while(it.hasNext()){
        String temp=it.next();
        long times=hm.get(temp)*temp.length();
        if(times>high){
        high=times;
        }
        }
        System.out.println(high);
    }
}
