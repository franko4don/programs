/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutiveprimesum;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Consecutiveprimesum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector <Long> v=new Vector<Long>();
       int limit=1700000;
       for(long i=0; i<=limit; i++){
       v.addElement(i);
       }
       for(int j=2; j<v.size(); j++){
       long get=v.elementAt(j);
       if(get==0){
       continue;
       }
       for(int k=j*2; k<v.size(); k+=j){
       if(v.elementAt(k)%get==0){
       v.set(k, 0L);
       }
       }
       }
       Vector<Long> store=new Vector<Long>();
       long add=0;
       for(int i=2; i<v.size(); i++){
       if(v.elementAt(i)==0){
       continue;
       }
       add+=v.elementAt(i);
       store.addElement(add);
       
       }
       int T=sc.nextInt();
       
       for(int i=0; i<T; i++){
       int high=0;
       long prime=0;
       long N=sc.nextLong();
       for(int j=store.size()-1; j>=0; j--){
       for(int k=store.size()-2; k>=0; k--){
       long sub=store.elementAt(j)-store.elementAt(k);
       if(sub>N){
       break;
       }
       if(sub%2==0){
       continue;
       }
       if(new BigInteger(Long.toString(sub)).isProbablePrime(3)){
       if(j-k>high){
       high=j-k;
       prime=sub;
       }
       }
       }
       }
       System.out.println(prime+" "+high);
       }
       
       }
    }

