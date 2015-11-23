/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Palindrome {
   static String first=null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt(); 
       String[]inputs=new String[T];
       for(int f=0; f<T; f++){
        String str=sc.next(); inputs[f]=str; }
       for(int e=0; e<inputs.length; e++){
           StringBuilder build=new StringBuilder();
          first=inputs[e];
          build.append(first);
        String finals=build.reverse().toString();
       /** char[]ist=new char[first.length()];
        for(int i=0; i<first.length(); i++){
        char ans=first.charAt(first.length()-1-i);
        ist[i]=ans;}
       finals=String.valueOf(ist,0,first.length());*/
        if(first.equals(finals)){
        System.out.println(0);
        }else{
pali();
        }
       }
       }
    public static void pali(){
        int[]sum1=new int[first.length()/2];
if(first.length()%2==0){
String part1=first.substring(0,(first.length()/2));
String part2=first.substring((first.length()/2),first.length());
for(int j=0; j<first.length()/2; j++){
char parta=part1.charAt(j);
char partb=part2.charAt(part2.length()-1-j);
int value1=partb-parta;
if(value1<0){
value1*=(-1);
}
sum1[j]=value1;
}
int h1=0;
for(int k=0; k<sum1.length; k++){
h1+=sum1[k];
}
System.out.println(h1);
}
else{
    int[]sum2=new int[first.length()/2];
String part3=first.substring(0,first.length()/2);
String part4=first.substring((first.length()/2)+1,first.length());
for(int k=0; k<first.length()/2; k++){
    char partc=part3.charAt(k);
    char partd=part4.charAt(part4.length()-1-k);
    int value2=partd-partc;
    if(value2<0){
    value2*=(-1);
    }
    sum2[k]=value2;
}
int h2=0;
for(int l=0; l<sum2.length; l++){
h2+=sum2[l];
}
System.out.println(h2);
    }
    }
}
