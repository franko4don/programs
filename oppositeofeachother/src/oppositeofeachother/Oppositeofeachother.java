/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oppositeofeachother;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Oppositeofeachother {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        int number=sc.nextInt();
        String operate=sc.next();
        int count=0;
        for(int j=0; j<N; j++){
        if(operate.charAt(j)=='B'){
        count++;
        }
        
        }
        if(count%2==0){
        System.out.println(number);
        }else{
        System.out.println(-1*number);
        }
        }
    }
}
