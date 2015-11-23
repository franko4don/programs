/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ashtonandstrings;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Ashtonandstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Vector v=new Vector();
    for(int k=0; k<T; k++){
    String start=sc.next();
    int K=sc.nextInt();
    HashSet hs=new HashSet();
    StringBuilder sb=new StringBuilder();
    sb.append(start);
    for(int i=0; i<start.length(); i++){ 
    String main="";
    for(int j=0; j<sb.length(); j++){
    main+=sb.charAt(j);
    hs.add(main);
    }
    sb.deleteCharAt(0);
    }
    Object lexi[]=hs.toArray();
    Arrays.sort(lexi);
    String get="";
    for(int l=0; l<lexi.length; l++){
    get+=lexi[l].toString();
    }
    v.addElement(get.charAt(K-1));
    }
    for(int x=0; x<v.size(); x++){
    System.out.println(v.elementAt(x));
    }
    }
}
