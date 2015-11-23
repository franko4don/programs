/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prosenjitandbooks;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Prosenjitandbooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int count=0;
       int check=0;
       int N=sc.nextInt();
       for(int j=0; j<N; j++){
       int get=sc.nextInt();
       if(get==check+1){
       check=get;
       }else{
       count++;
       }
       }
       System.out.println(count);
       }
    }
}
