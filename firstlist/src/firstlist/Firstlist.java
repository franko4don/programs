/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlist;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Firstlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        long small=9999999999L;
        int number[]=new int[N+M];
        for(int i=0; i<N; i++){
        number[i]=sc.nextInt();
        if(i<M){
        number[i+N]=number[i];
        }
        }
        int copy[]=Arrays.copyOf(number, M);
        Arrays.sort(copy);
        List check=new ArrayList();
        for(int y=0; y<copy.length; y++){
        check.add(copy[y]);
        }
        for(int j=0; j<N; j++){
        Object rem=number[j];
        Object add=number[j+M];
        check.remove(rem);
        for(int u=0; u<check.size()-1; u++){
        int put1=Integer.parseInt(check.get(u).toString());
        int put2=Integer.parseInt(check.get(u+1).toString());
        if(Integer.parseInt(add.toString())<put1){
        check.add(u,add);
        break;
        }
        if(Integer.parseInt(add.toString())>put1){
        check.add(u+1,add);
        break;
        }
        }
        if(Integer.parseInt(check.get(K-1).toString())<small){
        small=Integer.parseInt(check.get(K-1).toString());
        }
       // System.out.println(check);
        }
        System.out.println(small);
    }
}
