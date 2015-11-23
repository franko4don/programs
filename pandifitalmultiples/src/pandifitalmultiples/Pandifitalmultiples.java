/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pandifitalmultiples;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pandifitalmultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        String check="";
        for(int k=1; k<=K; k++){
        check+=Integer.toString(k);
        }
        for(int i=1; i<N; i++){
        String main="";
        for(int j=1; j<7; j++){
        int number=i*j;
        main+=Integer.toString(number);
        if(main.length()==K){
        char[]first=main.toCharArray();
        Arrays.sort(first);
        String compare=String.valueOf(first);
        if(compare.equals(check)){
        System.out.println(i);
        }
        }
        if(main.length()>K){
        break;
        }
        }
        }        
    }
}
