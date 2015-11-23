/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hexdump;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Hexdump {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        String input=sc.nextLine();
        String temp="";
        for(int i=0; i<input.length(); i++){
        if(input.charAt(i)==' '){
        v.addElement(temp);
        temp="";
        continue;
        }
        temp+=input.charAt(i);
        if(i==input.length()-1){
        v.addElement(temp);
        }
        }
       // System.out.println(v);
        Vector vec=new Vector();
        for(int j=0; j<v.size(); j++){
        BigInteger bi=new BigInteger(v.elementAt(j).toString(),16);
        vec.addElement(bi.toString(10));
        }
        System.out.println(vec);
    }
}
