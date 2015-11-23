/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twostrings;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Twostrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector v=new Vector();
        char one='a';
        char alp[]=new char[26];
        for(int i=0; i<26; i++){
        alp[i]=one;
        one+=1;
        }
        for(int i=0; i<T; i++){
        String a=sc.next();
        String b=sc.next();     
        int count=0;
        for(int j=0; j<26; j++){
        if(a.contains(String.valueOf(alp[j]))&&b.contains(String.valueOf(alp[j]))){
        count++;
        break;
        }
        }
        if(count>0){
        v.addElement("YES");
        }else{
        v.addElement("NO");
        }
        }
        for(int k=0; k<v.size(); k++){
        System.out.println(v.elementAt(k));
    }
    }
}
