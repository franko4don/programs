/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prngsequenceguessing;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Prngsequenceguessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int x=0; x<T; x++){
        Random rm=new Random();
        int start=sc.nextInt();
        int stop=sc.nextInt();
        int numbers[]=new int[10];
        for(int j=0; j<10; j++){
        numbers[j]=sc.nextInt();
        }
        int limit=0;
        for(int n=start; n<=stop; n++){
        rm.setSeed(n);
        int count=0;
        for(int i=0; i<10; i++){
        int gen=rm.nextInt(1000);
        if(gen==numbers[i]){
        count++;
        }
        }
        if(count==10){
        limit=n;
        break;
        }
        }
        rm.setSeed(limit);
        StringBuilder sb=new StringBuilder();
        sb.append(limit).append(" ");
        for(int k=0; k<20; k++){
        int pop=rm.nextInt(1000);
        if(k>9){
        sb.append(pop).append(" ");
        }
        }
        System.out.println(sb.toString().trim());
    }
    }
}
