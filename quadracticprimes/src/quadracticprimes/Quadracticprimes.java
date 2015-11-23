/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quadracticprimes;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Quadracticprimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
       BigInteger start=new BigInteger("10");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
       for(int i=2; i<=100000; i++){
       int remove=i;
       if(remove==2||remove==3||remove==5||remove==7){
       hm.put(remove, remove);
       continue;
       }
       double calc=Math.sqrt(remove);
       if(remove%2==0||remove%3==0||remove%5==0||remove%7==0||calc%1==0){
       continue;
       }
       int count=0;
       for(int y=0; y<divisors.size(); y++){
       if(remove%divisors.elementAt(y)==0&&remove!=divisors.elementAt(y)){
       count++;
       break;
       }
       }
       if(count!=0){
       continue;
       }
       hm.put(remove,remove);
       }
        int N=sc.nextInt();
        int high=0;
        int a=0;
        int b=0;
        for(int i=-N; i<=N; i++){
        for(int j=-N; j<=N; j++){
        int count=0;
        for(int k=0; k<10000; k++){
        int number=(k*k)+(k*i)+j;
        if(hm.containsKey(number)){
        count++;
        }else{
        break;
        }
        }
        if(count>high){
        high=count;
        a=i;
        b=j;
        }
        }
        }
        System.out.println(a+" "+b);
    }
}
