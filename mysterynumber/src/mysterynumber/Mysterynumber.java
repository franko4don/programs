/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mysterynumber;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Mysterynumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
       HashMap<Integer,Integer>hm2=new HashMap<Integer,Integer>();
       for(int i=0; i<N; i++){
       int number=sc.nextInt();
       if(hm1.containsKey(number)){
       hm1.put(number,hm1.get(number)+1);
       continue;
       }
       hm1.put(number, 1);
       }
       
       for(int i=0; i<N+1; i++){
       int number=sc.nextInt();
       if(hm2.containsKey(number)){
       hm2.put(number,hm2.get(number)+1);
       continue;
       }
       hm2.put(number, 1);
       }
       Set<Integer>st=hm2.keySet();
       Iterator<Integer> it=st.iterator();
       while(it.hasNext()){
       int value=it.next();
       if(hm1.containsKey(value)){
       if(hm1.get(value)!=hm2.get(value)){
       System.out.println(value);
       break;
       }
       }else{
       System.out.println(value);
       break;
       }
       }
       
       }
       }
    
