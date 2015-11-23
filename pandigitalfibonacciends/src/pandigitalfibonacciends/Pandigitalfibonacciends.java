/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pandigitalfibonacciends;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pandigitalfibonacciends {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        long k=sc.nextInt();
        String check=pandigital(k);
        long mod=(long)Math.pow(10, k);
       // System.out.println(check);
        int keep=0;
        for(int i=0; i<2000000; i++,keep++){
        long [][]fibo=new long[2][2];
        long [][]base=new long[2][1];     
        fibo[0][0]=1;
        fibo[0][1]=1;
        fibo[1][0]=1;
        fibo[1][1]=0;      
        base[0][0]=a;
        base[1][0]=b; 
        long val1=(modpower(fibo,i,mod,base));

        String get1=""+val1;
        char[]convert1=get1.toCharArray();
        Arrays.sort(convert1);
        String comp1=String.valueOf(convert1);
        if(comp1.equals(check)){
        long val2=top(i,(int)k);
        String get2=""+val2;
        char[]convert2=get2.toCharArray();
        Arrays.sort(convert2);
        String comp2=String.valueOf(convert2);
      //  System.out.println(i+"   "+val1+"  "+val2);
        if(comp2.equals(check)){
        System.out.println(i);
        break;
        }

        }
        }
        if(keep==2000000){
        System.out.println("no solution");
        }
    }
     
     public static String pandigital(long k){
     String bring="";
     for(int i=1; i<=k; i++){
     bring+=i+"";
     }
     return bring;
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
public static long top(int n,int m){
double t = (n * 0.20898764024997873 - 0.3494850021680094);
long ans=((long)Math.pow(10, t - (long)t + m-1));

return ans;

}
}
