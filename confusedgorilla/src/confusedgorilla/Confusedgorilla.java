/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package confusedgorilla;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Confusedgorilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int m=0; m<T; m++){
        int N=sc.nextInt();
        for(int j=0; j<=N; j++){
        if(j>=(N-j)){
        if(j==(N-j)){
        System.out.println(j+" "+(N-j));
        }
        break;
        }
        System.out.println(j+" "+(N-j));
        System.out.println((N-j)+" "+j);
        }
    }
}
}
