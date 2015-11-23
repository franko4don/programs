/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingfractions;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Countingfractions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       BigInteger start=new BigInteger("10");
       int prime[]=new int[1000001];
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
       prime[2]=2;
       for(int i=3; i<=1000000; i+=2){
       int remove=i;
       if(remove==3||remove==5||remove==7){
       prime[i]=remove;
       continue;
       }
       double calc=Math.sqrt(remove);
       if(remove%2==0||remove%3==0||remove%5==0||remove%7==0||calc%1==0){
       continue;
       }
       int count=0;
       for(int y=0; y<divisors.size(); y++){
       if(divisors.elementAt(y)>(int)Math.sqrt(remove)){
       break;
       }
       if(remove%divisors.elementAt(y)==0&&remove!=divisors.elementAt(y)){
       count++;
       break;
       }
       }
       if(count!=0){
       continue;
       }
       prime[i]=remove;
       } 
       
      int temp[]=new int[1000001];
      for(int j=0; j<=1000000; j++){
      temp[j]=j;
      }
      long answer[]=new long[1000001];
      long add=0;
      for(int i=2; i<=1000000; i++){
      if(prime[i]==i){
      for(int k=i; k<=1000000; k+=i){   
      temp[k]=temp[k]/i*(i-1);
      }
      }
      add+=temp[i];
      answer[i]=add;
      } 
      StringBuilder process=new StringBuilder();
      int T=sc.nextInt();
      for(int j=0; j<T; j++){
      int N=sc.nextInt();
      if(j<T-1){
      process.append(answer[N]).append("\n");
      continue;
      }
      process.append(answer[N]);
      }
      System.out.println(process);
      
    }
}
