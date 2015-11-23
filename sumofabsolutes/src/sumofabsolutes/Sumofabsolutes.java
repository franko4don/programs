/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofabsolutes;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sumofabsolutes {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int numbers[]=new int[N];
        int check[]=new int[N];
        for(int i=0; i<N; i++){
        numbers[i]=Math.abs(sc.nextInt());
        }
        int count=0;
        for(int i=0; i<check.length; i++){
        
        if(numbers[i]%2==1){
        count++;        
        }
        check[i]=count;
        }
        for(int j=0; j<Q; j++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        if((check[y-1]-check[x-1])%2==1){      
        System.out.println("Odd");
        
        }else{
        System.out.println("Even");
        }
        }
        
       System.out.println(Arrays.toString(check));
    }
}
