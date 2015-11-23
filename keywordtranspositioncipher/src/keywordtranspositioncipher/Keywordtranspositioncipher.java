/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordtranspositioncipher;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Keywordtranspositioncipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int N=sc.nextInt();
        HashMap<Character,Character>hm=new HashMap<Character,Character>();
        Vector<Character>v=new Vector<Character>();
        String input=sc.next();
        for(int i=0; i<input.length(); i++){
        char put=input.charAt(i);
        if(!hm.containsKey(put)){
        v.add(put);
        }
        hm.put(put, put);
        }
        int size=26/v.size();
        char one='A';
        char store[][]=new char[size][size];
        for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
        if(!hm.containsKey(one)){
        store[i][j]=one;
        }
        one+=1;
        }
        }
       System.out.println(Arrays.deepToString(store));
    }
}
