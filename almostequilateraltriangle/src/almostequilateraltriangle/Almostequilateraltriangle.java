/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package almostequilateraltriangle;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Almostequilateraltriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Long>answer=new Vector<Long>();
        Vector<Long>v1=new Vector<Long>();
        v1.addElement(5L);
        v1.addElement(65L);
        v1.addElement(901L);
        answer.addElement(v1.elementAt(0)+v1.elementAt(0)+v1.elementAt(0)+1);
        answer.addElement(v1.elementAt(1)+v1.elementAt(1)+v1.elementAt(1)+1);
        answer.addElement(v1.elementAt(2)+v1.elementAt(2)+v1.elementAt(2)+1);
        for(int i=0; i<13; i++){
        long calc=(15*v1.elementAt(i+2)-(15*v1.elementAt(i+1))+v1.elementAt(i));
       // System.out.println(calc);
        v1.addElement(calc);
        answer.addElement(calc+calc+calc+1);
        }
        
        Vector<Long>v2=new Vector<Long>();
        v2.addElement(16L);
        v2.addElement(240L);
        v2.addElement(3360L);
        answer.addElement(v2.elementAt(0)+v2.elementAt(0)+1+v2.elementAt(0)+1);
        answer.addElement(v2.elementAt(1)+v2.elementAt(1)+1+v2.elementAt(1)+1);
        answer.addElement(v2.elementAt(2)+v2.elementAt(2)+1+v2.elementAt(2)+1);
        for(int i=0; i<12; i++){
        long calc=(15*v2.elementAt(i+2)-(15*v2.elementAt(i+1))+v2.elementAt(i));
       // System.out.println(calc);
        v2.addElement(calc);
        answer.addElement(calc+calc+1+calc+1);
        }
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        long N=sc.nextLong();
        long sum=0;
        for(int j=0; j<answer.size(); j++){
        if(answer.elementAt(j)<=N){
        sum+=answer.elementAt(j);
        }
        }
        System.out.println(sum);
        }
        
}

}
