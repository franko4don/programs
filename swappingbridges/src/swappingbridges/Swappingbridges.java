/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swappingbridges;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Swappingbridges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        Vector<Integer>v1=new Vector<Integer>();
        Vector<Integer>v2=new Vector<Integer>();
        for(int j=1; j<=N; j++){
        int numb=sc.nextInt();
       // hm.put(j, numb);
        v1.addElement(j);
        v2.addElement(numb);
        }
        int min=Integer.MAX_VALUE;
        for(int k=1; k<=N; k++){
        HashMap<Integer,Integer>start=new HashMap<Integer,Integer>();
        for(int m=0; m<N; m++){
        start.put(v1.elementAt(m), v2.elementAt(m));
        }
        
        int test=k;
        while(start.containsKey(test)){
        int temp=test;
        test=start.get(temp);  
        start.remove(temp);
        }
        if(start.size()<min){
        min=start.size();
        }
       // System.out.println(start);
       
        
        }
        System.out.println(min);
        }
    }
}
