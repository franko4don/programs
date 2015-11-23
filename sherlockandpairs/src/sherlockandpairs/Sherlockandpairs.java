/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandpairs;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Sherlockandpairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       int N=sc.nextInt();
       long count=0;
       for(int j=0; j<N; j++){
       int input=sc.nextInt();
       if(hm.containsKey(input)){
       int add=hm.get(input);
       hm.put(input, add+1);
       }else{
       hm.put(input,1);
       }
       }
       
       Set st=hm.keySet();
       Iterator<Integer>it=st.iterator();
       while(it.hasNext()){
       long set=hm.get(it.next());
       count+=(set*(set-1));
       }
       
       System.out.println(count);
       
       }
    }
}
