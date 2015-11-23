/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package truncatableprimes;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Truncatableprimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector v=new Vector();
       Vector ans=new Vector();
       int []divisors=new int[]{11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
       HashMap hm=new HashMap();
       for(int i=2; i<=1000000; i++){
       int remove=i;
       if(remove==2||remove==3||remove==5||remove==7){
       hm.put(remove,remove);
       continue;
       }
       double calc=Math.sqrt(remove);
       if(remove%2==0||remove%3==0||remove%5==0||remove%7==0||calc%1==0){
       continue;
       }
       int count=0;
       for(int y=0; y<divisors.length; y++){
       if(remove%divisors[y]==0&&remove!=divisors[y]){
       count++;
       break;
       }
       }
       if(count!=0){
       continue;
       }
       hm.put(remove,remove);
       v.addElement(remove);
       }
       //the prime numbers are generated and stored in the hashmap and vector
       for(int l=0; l<v.size(); l++){
       String main=v.elementAt(l).toString();
       StringBuilder sb1=new StringBuilder();
       StringBuilder sb2=new StringBuilder();
       sb1.append(main);
       int count1=1;
       int count2=1;
       sb2.append(main);
       for(int h=0; h<main.length()-1; h++){
       int check1=Integer.parseInt(sb1.deleteCharAt(0).toString());
       int check2=Integer.parseInt(sb2.deleteCharAt(sb2.length()-1).toString());
       if(hm.containsKey(check1)){
       count1++;
       }
       if(hm.containsKey(check2)){
       count2++;
       }
       }      
       if((count1+count2)==main.length()*2){
       ans.addElement(main);
       }
       }
       int sum=0;
       HashMap values=new HashMap();
       for(int t=0; t<ans.size(); t++){
       sum+=Integer.parseInt(ans.elementAt(t).toString());
       values.put(Integer.parseInt(ans.elementAt(t).toString()), sum);
       }
       int N=sc.nextInt();
       for(int m=N; m>=0; m--){
       if(values.containsKey(m)){
       System.out.println(values.get(m));
       break;
       }
       }
       //the above code gets the summation of prime numbers which when truncated from left to right and vice versa remains a prime
    }
}
