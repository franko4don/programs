/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciandprime;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Fibonacciandprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       HashMap <Long,Long>hm=new HashMap<Long,Long>();
       BigInteger start=new BigInteger("0");
       for(int t=0; t<1000000; t++){
       start=start.nextProbablePrime();
       if(start.intValue()>1000){
       break;
       }
       divisors.addElement(start.intValue());
       }
       for(int i=2; i<=1000000; i++){
       int remove=i;
       if(remove==2||remove==3||remove==5||remove==7){
       hm.put((long)remove, (long)remove);
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
       hm.put((long)remove,(long) remove);
       }
       Vector<Long> fib=new Vector<Long>();
        for(int n=0; n<2000; n++){
        long [][]fibo=new long[2][2];
        long [][]base=new long[2][1];     
        fibo[0][0]=1;
        fibo[0][1]=1;
        fibo[1][0]=1;
        fibo[1][1]=0;      
        base[0][0]=1;
        base[1][0]=0;       
        long value=modpower(fibo,n,1000000007,base);
       // System.out.println(value);
        if(hm.containsKey(value)){
        fib.addElement(value);
        }
        if(value>1000000)break;
        }
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
        int N=sc.nextInt();
        long sum=0;
        for(int j=0; j<fib.size(); j++){
        if(fib.elementAt(j)>N){
        break;
        }
        sum+=fib.elementAt(j);
        }
        System.out.println(sum);
        }
        
    }
    public static long modpower(long fibo[][],long pow, long mod,long base[][]){
       long temp1=1;
       long temp2=1;
       long temp3=1;
       long temp4=1;
       String get=Long.toBinaryString(pow);
       char[]op=get.toCharArray();      
       Vector<Long> v1=new Vector<Long>();
       Vector<Long> v2=new Vector<Long>();
       Vector<Long> v3=new Vector<Long>();
       Vector<Long> v4=new Vector<Long>();
       long times[][]=fibo;
       v1.addElement(times[0][0]);
       v2.addElement(times[0][1]);
       v3.addElement(times[1][0]);
       v4.addElement(times[1][1]);
       
       for(int j=0; j<op.length-1; j++){       
       long a=(times[0][0]*times[0][0])+(times[0][1]*times[1][0]);
       long b=(times[0][0]*times[0][1])+(times[0][1]*times[1][1]);
       long c=(times[1][0]*times[0][0])+(times[1][1]*times[1][0]);
       long d=(times[1][0]*times[0][1])+(times[1][1]*times[1][1]);
       a%=mod;
       b%=mod;
       c%=mod;
       d%=mod;
       times[0][0]=a;
       times[0][1]=b;
       times[1][0]=c;
       times[1][1]=d;
       v1.addElement(times[0][0]);
       v2.addElement(times[0][1]);
       v3.addElement(times[1][0]);
       v4.addElement(times[1][1]);
       }
       int count=0;
       for(int k=0; k<op.length; k++){
       if(op[k]=='1'){
       if(count==0){
       temp1=v1.elementAt(v1.size()-1-k);
       temp2=v2.elementAt(v2.size()-1-k);
       temp3=v3.elementAt(v3.size()-1-k);
       temp4=v4.elementAt(v4.size()-1-k);
       count++;
       continue;
       }
       long a=(temp1*v1.elementAt(v1.size()-1-k)+temp3*v3.elementAt(v3.size()-1-k));
       a%=mod;
       long b=(temp1*v2.elementAt(v2.size()-1-k)+temp2*v4.elementAt(v4.size()-1-k));
       b%=mod;
       long c=temp3*v1.elementAt(v1.size()-1-k)+temp4*v3.elementAt(v3.size()-1-k);
       c%=mod;
       long d=temp3*v2.elementAt(v2.size()-1-k)+temp4*v4.elementAt(v4.size()-1-k);
       d%=mod;
       temp1=a;
       temp2=b;
       temp3=c;
       temp4=d;
       }
       }
       long array[][]=new long[2][2];
       array[0][0]=temp1;
       array[0][1]=temp2;
       array[1][0]=temp3;
       array[1][1]=temp4;
       long e=(array[0][0]*base[0][0])+(array[0][1]*base[1][0]);
       long f=(array[1][0]*base[0][0])+(array[1][1]*base[1][0]);
       base[0][0]=e;
       base[1][0]=f;
       if(pow==0){
       return 0;
       }else{
       return f%mod;
       }
    }
    }

