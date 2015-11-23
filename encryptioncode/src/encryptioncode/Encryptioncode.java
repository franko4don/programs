/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptioncode;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Encryptioncode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String main="";
        Vector<String> v=new Vector<String>();
        HashMap<Character,Integer> first=new HashMap<Character,Integer>();
        HashMap<Integer,Character> second=new HashMap<Integer,Character>();
        StringBuilder sb=new StringBuilder(); 
        char ist='a';
        char sec='A';
        first.put(' ',(int)' ');
        second.put((int)' ', ' ');
        for(int i=0; i<26; i++){
        first.put(ist,(int)ist);
        first.put(sec,(int)sec);
        second.put((int)ist, ist);
        second.put((int)sec, sec);
        ist+=1;
        }
        String compute=sc.nextLine();
        for(int j=0; j<compute.length(); j++){
        v.addElement(Integer.toString(first.get(compute.charAt(j)),8));
        main+=Integer.toString(first.get(compute.charAt(j)),8);
        }
        for(int x=0; x<v.size(); x++){
         BigInteger b=new BigInteger(v.elementAt(x),8);
        int calc=Integer.parseInt(b.toString(10));
        sb.append(second.get(calc));
        }
        System.out.println(main);
        System.out.println(sb);
    }
}
