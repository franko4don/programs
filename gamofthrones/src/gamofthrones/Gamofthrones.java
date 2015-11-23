/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamofthrones;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author FRANKCHUKY
 */
public class Gamofthrones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
          Vector v=new Vector();
        String first=sc.next();
        int h=0;
        int odds=0;
         char one='a';
         char compare;
         char[]chr1=new char[26];
         char[]chr2=new char[first.length()];
         for(int i=0; i<first.length(); i++){//breaks the string into characters and stores them in an array
         char brokenstrings=first.charAt(i);
         chr2[i]=brokenstrings;
         }
        for(int j=0; j<26; j++){
         chr1[j]=one; //generates and stores the letters in a char array
         one+=1;
         }
         for(int k=0; k<26; k++){
         compare=chr1[k];
         for(int l=0; l<first.length(); l++){
         if(compare==chr2[l]){ //compares the characters in the arrays
         h+=1;
         }
         }
         if(h>0){
         v.addElement(h);//adds the values of the int h to a vector v
         }
         h=0;
         }
         for(int m=0; m<v.size(); m++){ //loops through the vector
         if(Integer.parseInt(v.elementAt(m).toString())%2!=0){
         odds+=1; //executes if the value/2 gives a remainder
         }
         }
         if(odds>1){
         System.out.println("NO");//executes if odds is greater than 1
         }
         else{
         System.out.println("YES");//executes if odds is less than or equal to 1
         }
}
}