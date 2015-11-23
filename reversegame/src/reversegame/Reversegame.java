/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reversegame;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Reversegame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){ 
        int N=sc.nextInt();
        int K=sc.nextInt();
        int []numbers=new int[N];
        int k=N-1;
        int put=0;
        for(int j=0; j<N; j++){
        if(j%2==0){
        numbers[j]=k;
        k--;
        }else{
        numbers[j]=put; 
        put+=1;
        }
        }
        for(int l=0; l<numbers.length; l++){
        if(numbers[l]==K){
        v.addElement(l);
        break;
        }
        }
        }
        for(int m=0; m<v.size(); m++){
        System.out.println(v.elementAt(m));
        }
    }
}
