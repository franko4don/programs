/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primedigitreplacements;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Primedigitreplacements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       int prime[]=new int[1000001];
       BigInteger start=new BigInteger("10");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
       v.addElement(2);
       for(int i=3; i<=1000000; i+=2){
       int remove=i;
       if(remove==3||remove==5||remove==7){
       v.addElement(remove);
       continue;
       }
       double calc=Math.sqrt(remove);
       if(remove%2==0||remove%3==0||remove%5==0||remove%7==0||calc%1==0){
       continue;
       }
       int count=0;
       for(int y=0; y<divisors.size(); y++){
       if(remove%divisors.elementAt(y)==0&&remove!=divisors.elementAt(y)){
       count++;
       break;
       }
       }
       if(count!=0){
       continue;
       }
       v.addElement(remove);
       }
       Vector<String>perm=new Vector<String>();
       for(int i=0; i<v.size(); i++){
       String temp=Integer.toString(v.elementAt(i));
       perm.addElement(temp);
       }
        int N=sc.nextInt();
        int K=sc.nextInt();
        int L=sc.nextInt();
        int keep=0;
        for(int l=0; l<=9; l++){
        String test=repeat(Integer.toString(l),K);
        for(int k=keep; k<perm.size(); k++){
        if(perm.elementAt(k).length()==N){
        if(perm.elementAt(k).contains(test)){
        System.out.println(v.elementAt(k));
        keep=k;
        continue;
        }
        }
        }
        }
    }
    public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
}
}
