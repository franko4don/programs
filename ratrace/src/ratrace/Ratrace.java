/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratrace;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Ratrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double highest=9999999999.0;
        double speed[]=new double[N];
        double distance[]=new double[N];
        double time[]=new double[N];
        for(int i=0; i<N; i++){
        speed[i]=sc.nextDouble();
        }
        for(int i=0; i<N; i++){
        distance[i]=sc.nextDouble();
        }
        
        for(int j=0; j<N; j++){
        time[j]=distance[j]/speed[j];
        if(time[j]<=highest){
        highest=time[j];
        }
        }
        for(int i=0; i<N; i++){
        if(time[i]==highest){
        System.out.println(i+1);
        }
        }
    }
}
