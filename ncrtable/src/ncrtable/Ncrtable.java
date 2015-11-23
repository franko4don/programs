/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncrtable;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Ncrtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Vector<String> v=new Vector<String>();
      String put="1 2 1";
      v.addElement("1 1");
      v.addElement(put);
      for(int i=3; i<=1001; i++){
      String []take=put.split(" ");
      StringBuilder sb=new StringBuilder().append(1);
      for(int j=0; j<take.length-1; j++){
      long add=(Long.parseLong(take[j])%1000000000+Long.parseLong(take[j+1])%1000000000)%1000000000;
      sb.append(" ").append(add);
      }
      sb.append(" ").append(1);
      v.addElement(sb.toString());
      put=sb.toString();
      }
      int T=sc.nextInt();
      for(int k=0; k<T; k++){
      int n=sc.nextInt();
      System.out.println(v.elementAt(n-1));
      }
    }
}
