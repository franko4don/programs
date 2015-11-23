/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuandswaps;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sudokuandswaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[]numbers=new String[N];
        System.out.println(Arrays.toString(numbers));
        for(int i=0; i<N; i++){
        numbers[i]=sc.next();
        }
        
        for(int j=0; j<=100; j++){
        int count=0;
        for(int k=0; k<numbers.length; k++){
       
        }
        if(count==1){
        System.out.println(j);
        break;
        }
        }
    }
}
