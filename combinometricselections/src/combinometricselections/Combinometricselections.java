/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combinometricselections;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Combinometricselections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      long N=sc.nextLong();
      BigInteger K=new BigInteger(sc.next());
      long count=0;
      Vector <String> v=new Vector<String>();
      v.add("1 1");
      String put="1 1";
      for(int i=2; i<=N; i++){
      StringBuilder sb=new StringBuilder().append(1);
      String get[]=put.split(" ");
      for(int j=0; j<get.length-1; j++){
      BigInteger first=new BigInteger(get[j]);
      BigInteger second=new BigInteger(get[j+1]);
      BigInteger ans=first.add(second);
      if(ans.toString().length()>19){
      ans=new BigInteger(ans.toString().substring(0,19));
      sb.append(" ").append(ans.toString());
      }else{
      sb.append(" ").append(ans.toString());
      }
      if(ans.subtract(K).signum()==1){
      count++;
      }
      }
      sb.append(" ").append(1);
      v.addElement(sb.toString());
      v.remove(0);
      put=sb.toString();
      }
      System.out.println(count);    
    } 
}
