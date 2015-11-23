/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lycherelnumbers;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Lycherelnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashSet hs=new HashSet();
        HashMap <String,Integer>hm=new HashMap<String,Integer>();
        Vector v=new Vector();
        for(int i=1; i<=N; i++){
        long sum=i;
        BigInteger b1=new BigInteger(Long.toString(sum));
        for(int j=0; j<60; j++){
        StringBuilder sb=new StringBuilder();
        sb.append(b1);
        String compare=b1.toString();
        String reverse=sb.reverse().toString();
        BigInteger b2=new BigInteger(reverse);
        if(compare.equals(reverse)){
        v.addElement(compare);
        if(hm.containsKey(compare)){
        int add=hm.get(compare)+1;
        hm.put(compare, add);
        }else{
        hm.put(compare, 1);
        }
        hs.add(compare);
        break;
        }
        b1=b1.add(b2);
        }
        }
        Set st=hm.keySet();
        Iterator<String> it=st.iterator();
        String ans="";
        int count=0;
        while(it.hasNext()){
        String temp=it.next();
        if(hm.get(temp)>count){
        count=hm.get(temp);
        ans=temp;
        }
        }
        System.out.println(ans+" "+count);
    }
}
