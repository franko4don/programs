/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package circularprimes;
import java.util.*;
import java.math.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Circularprimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Vector<Integer> v=new Vector<Integer>();
       int []divisors=new int[]{11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
       HashMap hm=new HashMap();
       for(int i=2; i<=1000000; i++){
       int remove=i;
       if(remove==2||remove==3||remove==5||remove==7){
       v.addElement(remove);
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
       HashMap getanswers=new HashMap();
       long sum=0;
       for(int l=0; l<v.size(); l++){
       String rotate=Integer.toString(v.elementAt(l));
       int count=0;
       StringBuilder sb=new StringBuilder();
       sb.append(rotate);
       for(int k=0; k<rotate.length(); k++){
       int check=Integer.parseInt(sb.toString());
       if(hm.containsKey(check)){
       count++;
       }
       sb.deleteCharAt(0);
       sb.append(rotate.charAt(k));
       }
       if(count==rotate.length()){
       sum+=v.elementAt(l);
      getanswers.put(v.elementAt(l), sum);
       }
    }
       int N=sc.nextInt();
       for(int p=N; p>=0; p--){
       if(getanswers.containsKey(p)){
       System.out.println(getanswers.get(p));
       break;
       }
       }
    }
}
