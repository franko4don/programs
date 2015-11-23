/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhash;
import java.io.File;
import java.io.*;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Learnhash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashMap map= new HashMap();
        int count=0;
        String first=br.readLine();
        String temp[]=first.split(" ");
        Integer N=Integer.parseInt(temp[0]);
        Integer K=Integer.parseInt(temp[1]);
        String numberlines=br.readLine();
        String input[]=numberlines.split(" ");
        for(int i=0; i<N; i++){
        Integer a1=Integer.parseInt(input[i]);
        map.put(a1, i);
        }
        for(int j=0; j<N; j++){
        Integer a2=Integer.parseInt(input[j]);
        if(map.containsKey(a2.intValue()-(K))){
        count++;
        }
        }
       System.out.println(count);
    }
}
