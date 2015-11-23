/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(); //length of the string
    int Q=sc.nextInt(); //number of queries
    String start=sc.next().substring(0,N); //string to be operated on
    Vector v=new Vector();
    for(int k=0; k<Q; k++){
    String temp=start;
    int number=sc.nextInt(); //index of string to be replaced by a query
    String replace=sc.next(); //string to replace the char at index number
    HashSet hs=new HashSet();
    StringBuilder sb2=new StringBuilder();
    sb2.append(temp); 
    sb2.replace(number-1,number, replace);//the char is replaced
    start=sb2.toString(); //assigns the new value of the string builder to the string start
    for(int i=0; i<start.length(); i++){
    String concat="";
    for(int j=0; j<sb2.length(); j++){
    concat+=sb2.charAt(j);
    hs.add(concat); //adds the distinct substrings to a hash set
    }   
    sb2.deleteCharAt(0);
    }
    v.addElement(hs.size());   //adds the size of the hash set to a vector
    }
    for(int d=0; d<v.size(); d++){
    System.out.println(v.elementAt(d));//prints the values
    }
    }

}
