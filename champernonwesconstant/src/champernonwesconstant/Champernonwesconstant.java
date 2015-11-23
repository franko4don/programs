/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package champernonwesconstant;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Champernonwesconstant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        StringBuilder sb=new StringBuilder();
        String keep="";
        for(long i=1; i<999999999L; i++){
        if(keep.length()>1000000000000000000L){
        break;
        }
        sb.append(i);
        if((long)sb.length()>1000000000000000000L){
        break;
        }
        }
        for(int j=0; j<T; j++){
        long times=1;
        for(int x=0; x<7; x++){
        long multi=Character.getNumericValue(keep.charAt(sc.nextInt()-1));
        times*=multi;
        }
        System.out.println(times);
        }
        
    }
}
