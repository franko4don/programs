/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beginend;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Beginend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String get=sc.next();
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        char check[]=get.toCharArray();
        for(int j=0; j<check.length; j++){
        char test=check[j];
        if(hm.containsKey(test)){
        int add=hm.get(test)+1;
        hm.put(test, add);
        continue;
        }
        hm.put(test, 1);
        }
        long print=0;
        Set st=hm.keySet();
        Iterator<Character> it=st.iterator();
        while(it.hasNext()){
        char obtain=it.next();
        int value=hm.get(obtain);
        print+=(value*(1+value))/2;
        }
        System.out.println(print);
    }
}
