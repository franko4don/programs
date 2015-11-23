/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emmasnotebook;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Emmasnotebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number[]=new long[100002];
        long add=1;
        long inc=2;
        number[1]=1;
        for(int i=2; i<number.length; i+=2){
        add+=inc;
        number[i]=add;
        add+=inc;
        number[i+1]=add;
        inc++;
        }
        System.out.println(number[in.nextInt()]);
        
    }
}
