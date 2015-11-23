/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package findtherobot;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Findtherobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt()-1;
       calc(N);
       }
    }
    public static void calc(int N){
    
    int x=0;
    int y=0;
    int mod=N%4;
    int times=N/4;
    if(mod==0){
    x=(times*2)+1;
    y=times*-2;
    }
    
    if(mod==1){
    x=(times*2)+1;
    y=(times*2)+2;
    }
    if(mod==2){
    x=((times*2)+2)*-1;
    y=(times*2)+2;
    }
    if(mod==3){
    x=((times*2)+2)*-1;
    y=((times*2)+2)*-1;
    }
    System.out.println(x+" "+y);
    }
}
