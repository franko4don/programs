/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cubicpermutations;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Cubicpermutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<String> v=new Vector<String>();
        HashMap<String,Integer> hm=new HashMap <String,Integer>();
        HashMap<String,Long> hm2=new HashMap <String,Long>();
        long N=sc.nextLong();
        int K=sc.nextInt();
        for(long i=345; i<=N; i++){
        long cube=i*i*i;
        String put=Long.toString(cube);
        char let[]=put.toCharArray();
        Arrays.sort(let);
        String putin=String.valueOf(let);
        if(hm.containsKey(putin)){
        int grab=hm.get(putin)+1;
        hm.put(putin, grab);
        continue;
        }
        hm.put(putin,1);
        hm2.put(putin, cube);
    }
        Set st=hm.keySet();
        Vector<Long> order=new Vector<Long>();
        Iterator<String> it=st.iterator();
        while(it.hasNext()){
        String in=it.next();
        int number=hm.get(in);
        if(number==K){
        order.addElement(hm2.get(in));
        }
        }
        Object sort[]=order.toArray();
        Arrays.sort(sort); 
        for(int k=0; k<sort.length; k++){
        System.out.println(sort[k]);
        }
    }
}
