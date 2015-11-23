/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countthestring;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countthestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char one='a';
        char alpha[]=new char[26];
        for(int i=0; i<26; i++){
        alpha[i]=one;
        one+=1;
        }
        int T=sc.nextInt();
        for(int j=0; j<T; j++){
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        int size=sc.nextInt();
        int K=sc.nextInt();
        String N=sc.next();      
        for(int m=0; m<26; m++){
        int count=0;
        for(int n=0; n<N.length(); n++){
        if(alpha[m]==N.charAt(n)){
        count++;
        }
        }
        if(count>K){
        if(hm.containsKey(count)){
        String get=hm.get(count);
        hm.put(count, get+alpha[m]);
        }else{
        hm.put(count,String.valueOf(alpha[m]));
        }
        }
        }
        Set st=hm.keySet();
        Iterator <Integer>it=st.iterator();
        Vector v=new Vector();
        while(it.hasNext()){
        v.addElement(it.next());
        }
        Object value[]=v.toArray();
        Arrays.sort(value);
        String answer="";
        for(int p=value.length-1; p>=0; p--){
        answer+=hm.get(Integer.parseInt(value[p].toString()));
        }
        if(answer.equals("")){
        System.out.println("NONE");
        }else{
        System.out.println(answer);
        }
        }
    }
}
