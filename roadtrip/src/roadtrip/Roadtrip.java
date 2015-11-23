/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtrip;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Roadtrip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=0;
        long small=0;
        int M=sc.nextInt();
        int distance[]=null;
        int tempdistance[];
        int maincost[]=null;
        int cost[];
        for(int i=0; i<M; i++){
        int N=sc.nextInt(); 
        int F=sc.nextInt();
        int T=sc.nextInt(); 
        int L=sc.nextInt();
        tempdistance=new int[N];
        cost=new int[N];
        for(int k=0; k<N; k++){
        tempdistance[k]=sc.nextInt();
        cost[k]=sc.nextInt();
        }
        distance=Arrays.copyOf(tempdistance,tempdistance.length);
        maincost=new int[N];
        Arrays.sort(distance);
        int b;
        
        }
        System.out.println(Arrays.toString(maincost));
        System.out.println(Arrays.toString(distance));
        System.out.println(h);  
        System.out.println(small);
    }
}
