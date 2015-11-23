/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesof5and3;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Multiplesof5and3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        for(int i=0; i<T; i++){
        long N=sc.nextInt();
        long three;
        long five;
        long fifteen;
        if(N%3==0){
        three=(N/3)-1;
        }else{
        three=N/3;
        }
        if(N%5==0){
        five=(N/5)-1;
        }else{
        five=N/5;
        }
        if(N%15==0){
        fifteen=(N/15)-1;
        }else{
        fifteen=N/15;
        }
        long temp1=three*3;
        long temp2=five*5;
        long temp3=fifteen*15;
        long first=3;
        long second=5;
        long third=15;
        long sum1=(three*(first+temp1))/2;
        long sum2=(five*(second+temp2))/2;
        long sum3=(fifteen*(third+temp3))/2;
        long add=sum1+sum2-sum3;
        v.addElement(add);
        }
        for(int j=0; j<v.size(); j++){
        System.out.println(v.elementAt(j));
        }
    }
}
