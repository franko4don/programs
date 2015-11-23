/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomin;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Zoomin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String[]>hm=new HashMap<String,String[]>();
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        for(int i=0; i<K; i++){
        String get=sc.next();
        String array[]=new String[M+1];
        for(int j=0; j<array.length; j++){
        String collect=sc.nextLine();
        array[j]=collect;
        }
        hm.put(get, array);
        }
        String empty[]=new String[M+1];
        Arrays.fill(empty, " ");
        hm.put("\n", empty);
        int X=sc.nextInt();
        sc.nextLine();   
        for(int l=0; l<X; l++){
        String input=sc.nextLine();
        String getanswer[]=new String[M];
        Arrays.fill(getanswer, "");
        char obtain[]=input.toCharArray();
        for(int i=0; i<obtain.length; i++){
        String get=String.valueOf(obtain[i]);
        for(int j=0; j<M; j++){
        String retrieve[]=hm.get(get);
        getanswer[j]+=retrieve[j+1];
        }
        }
        for(int k=0; k<getanswer.length; k++){
        System.out.println(getanswer[k]);
        }
        
        }
    }
        public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
