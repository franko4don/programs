/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gemstones;
import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Gemstones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
       Vector v=new Vector();
        int N=sc.nextInt();  
        int h=0;
        int f=0;
       String[]rocks=new String[N];
       char c='a';
       char[]alpha=new char[26];
       char one;
        for(int i=0; i<N; i++){
        String values=sc.next(); rocks[i]=values;
        }
        for(int j=0; j<26; j++){//counts the 26 letters of the alphabet and saves it in an array
        alpha[j]=c;
       c+=1;
        }
       for(int m=0; m<alpha.length; m++){
         one=alpha[m];
         for(int n=0; n<N; n++){ //loops through the string away and checks if the character is contained in the strings
         if(rocks[n].contains(rocks[n].valueOf(one))){
         h+=1;
         } 
         }
         if(h==N){
         int l=1; v.addElement(l);
         }
         h=0;
       }  
           for(int z=0; z<v.size(); z++){
              f+=Integer.parseInt(v.elementAt(z).toString());
           }
           System.out.println(f);
             }

             
    }