/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lcmchallenge;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Lcmchallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       BigInteger start=new BigInteger("0");
       for(int t=0; t<10000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>200){
       break;
       }
       divisors.addElement(start.intValue());
       }
       v.addElement(2);
       for(int i=3; i<=31624; i+=2){
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
      // System.out.println(v.size());
       int T=sc.nextInt();
       for(int i=0; i<T; i++){
       int N=sc.nextInt();
       int number[]=new int[N];
       for(int j=0; j<N; j++){
       number[j]=sc.nextInt();
       }
       int Q=sc.nextInt();
       for(int k=0; k<Q; k++){
       int left=sc.nextInt();
       int right=sc.nextInt();
       int temp[]=Arrays.copyOfRange(number, left-1, right);
       long ans=lcm(v,temp);
       System.out.println(ans);
       }
       }
    }
    
    public static long lcm(Vector<Integer> divisors, int array[]){
    long lcm=1;
    int pos=0;
    int control=0;
    Arrays.sort(array);
    while(pos!=divisors.size()-1){
    int prime=divisors.elementAt(pos);
    int count=0;
    int checkones=0;
    for(int i=0; i<array.length; i++){
    if(array[i]%prime==0){
    array[i]/=prime;
    count++;
    }
    if(array[i]==1){
    checkones++;
    }
    }
    //System.out.println(prime+"  "+Arrays.toString(array));
    
    if(count==0){
    pos++;
    }else{
    lcm*=prime;
    lcm%=1000000007;
    }
    if(checkones==array.length){
    control++;
    break;
    }
    }
    if(control==0){
    for(int j=0; j<array.length; j++){
    lcm*=array[j];
    lcm%=1000000007;
    }
    }
    return lcm%1000000007;
    }
}
