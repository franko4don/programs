/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package closestnumber;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Closestnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        long a=sc.nextLong();
        long b=sc.nextLong();
        long x=sc.nextLong();
        double power=Math.pow(a,b);
        long answer=(long)power;
        if(answer<0){
        v.addElement(0);
        continue;
        }
        long solution1=answer%x;
        long solution2=x-solution1;
        if(solution2<=solution1){
        v.addElement(answer+solution2);
        }else{      
        v.addElement(answer-solution1);
        }
        }
        for(int n=0; n<v.size(); n++){
        System.out.println(v.elementAt(n));
        }
    }
}
