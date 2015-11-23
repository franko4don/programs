/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commonchild;
import java.util.*;
public class Commonchild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char one='A';
        char alpha[]=new char[26];
        for(int i=0; i<26; i++){
        alpha[i]=one;
        one+=1;
        }
        int count=0;
        String a=sc.next();
        String b=sc.next();
        for(int j=0; j<26; j++){
        if(a.contains(String.valueOf(alpha[j]))&&b.contains(String.valueOf(alpha[j]))){
        count++;
        }
        }
        System.out.println(count);
    }
}
