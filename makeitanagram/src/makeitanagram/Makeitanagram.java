/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makeitanagram;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Makeitanagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        char main1[]=first.toCharArray();
        char main2[]=second.toCharArray();
        Arrays.sort(main1);
        Arrays.sort(main2);
        char one='a';
        char alpha[]=new char[26];
        for(int i=0; i<26; i++){
        alpha[i]=one;
        one+=1;
        }
        Vector v1=new Vector();
        Vector v2=new Vector();
        int keep1=0;
        for(int j=0; j<26; j++){
        char check=alpha[j];
        int count=0;
        for(int k=keep1; k<main1.length; k++){
        if(check!=main1[k]){
        keep1=k;
        break;
        }
        count++;
        }
        v1.addElement(count);
        }
        int keep2=0;
        for(int j=0; j<26; j++){
        char check=alpha[j];
        int count=0;
        for(int k=keep2; k<main2.length; k++){
        if(check!=main2[k]){
        keep2=k;
        break;
        }
        count++;
        }
        v2.addElement(count);
        }
        int sum=0;
        for(int l=0; l<26; l++){
        int count1=Integer.parseInt(v1.elementAt(l).toString());
        int count2=Integer.parseInt(v2.elementAt(l).toString());
        sum+=Math.abs(count1-count2);
        }
        System.out.println(sum);
    }
}
