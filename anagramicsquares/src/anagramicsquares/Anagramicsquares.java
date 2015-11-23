/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramicsquares;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Anagramicsquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Long>hm=new HashMap<String,Long>();
        long high=0;
        long ans=0;
        int N=sc.nextInt();
        long check=(long)Math.pow(10, N);
        for(long i=0; i<100000000; i++){
        long number=i*i;
        if(number>check){
        break;
        }
        String temp=""+number;
        char[]get=temp.toCharArray();
        Arrays.sort(get);
        String put=String.valueOf(get);
        if(hm.containsKey(put)){
        long add=hm.get(put)+1;
        hm.put(put,add);
        long keep=hm.get(put);
        if(keep>=high){
        high=keep;
        if(number>=ans){
        ans=number;
        }
        }
        }else{
        hm.put(put,1L);
        }
        
        }
        System.out.println(ans);
    }
}
