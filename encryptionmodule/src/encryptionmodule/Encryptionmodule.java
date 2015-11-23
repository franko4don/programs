/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionmodule;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Encryptionmodule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        String a=sc.next();
        String b=sc.next();
        int most=0;
        int key=0;
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        int number[]=new int[a.length()];
        for(int j=0; j<a.length(); j++){
        number[j]=b.charAt(j)-a.charAt(j);
        int check=b.charAt(j)-a.charAt(j);
        if(hm.containsKey(check)){
        hm.put(check, hm.get(check)+1);
        }else{
        hm.put(check, 1);
        }
        }
        Set<Integer>st=hm.keySet();
        Iterator<Integer>it=st.iterator();
        
        while(it.hasNext()){
        int get=it.next();
        if(hm.get(get)>most){
        most=hm.get(get);
        key=get;
        }
        }
        int count=0;
        for(int k=0; k<a.length(); k++){
        if(number[k]!=key)count++;
        }
        System.out.println(count);
        
        
        }
    }
}
