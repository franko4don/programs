/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rankorder;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Rankorder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=1;
        while(sc.hasNext()){
        int N=sc.nextInt();
        HashMap<Long,Long>hm=new HashMap<Long,Long>();
        long number[]=new long[N];
        for(int i=0; i<N; i++){
        number[i]=sc.nextLong();
        }
        for(int i=0; i<N; i++){
        hm.put(number[i], sc.nextLong());
        }
        int check=match(hm);
        System.out.println(check);
        if(check==N){
        System.out.println("Case "+cases+": agree");
        }else{
        System.out.println("Case "+cases+": "+check);
        }
        cases++;
        }
    }
    
    public static int match(HashMap<Long,Long> sort){
    int count=1;
    Set<Long> st=sort.keySet();
    Object values[]=st.toArray();
    Arrays.sort(values);
    for(int i=values.length-1; i>=1; i--){
    if(sort.get(Long.parseLong(values[i].toString()))>sort.get(Long.parseLong(values[i-1].toString()))){
    count++;
    }else{
    count=i-1;
    break;
    }
    
    }
        return count;
    }
}
