/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package angryproffesor;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Angryproffesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int K=sc.nextInt();
        int count=0;
        for(int j=0; j<N; j++){
        int temp=sc.nextInt();
        if(temp<=0){
        count++;
        }
        }
        if(count<K){
        System.out.println("YES");
        }else{
        System.out.println("NO");
        }
        }
    }
}
