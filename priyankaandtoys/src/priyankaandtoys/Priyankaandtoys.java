/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priyankaandtoys;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Priyankaandtoys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=1;
        int toyweight[]=new int[N];
        for(int i=0; i<N; i++){
        toyweight[i]=sc.nextInt();
        }
        Arrays.sort(toyweight);
        int base=toyweight[0]+4;
        for(int j=0; j<N; j++){
        if(toyweight[j]<=base){
        continue;
        }
        base=toyweight[j]+4;
        count++;
        }
        System.out.println(count);
    }
        
}
