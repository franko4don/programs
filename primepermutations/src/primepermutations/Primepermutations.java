/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primepermutations;

import java.math.BigInteger;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class Primepermutations {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Vector <Integer> v=new Vector<Integer>();
       Vector <Integer> divisors=new Vector<Integer>();
       HashMap<Integer,Integer>sample=new HashMap<Integer,Integer>();
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
       sample.put(remove,remove);
       }
       Vector <String>op=new Vector<String>();
       HashMap<String,String> hm2=new HashMap <String,String>();
       for(int i=0; i<v.size(); i++){
       String get=Integer.toString(v.elementAt(i));
       char []split=get.toCharArray();
       Arrays.sort(split);
       String transform=String.valueOf(split);
       if(hm2.containsKey(transform)){
       String check=hm2.get(transform);
       hm2.put(transform, check+Integer.toString(v.elementAt(i))+" ");
       continue;
       }
       hm2.put(transform, Integer.toString(v.elementAt(i))+" ");
       }
       int N=sc.nextInt();
       int K=sc.nextInt();
       int length=Integer.toString(N).length();
       Set st=hm2.keySet();
       Iterator<String> it=st.iterator();
       while(it.hasNext()){
       String get=it.next();
       if(get.length()<=length){
       String check[]=hm2.get(get).trim().split(" ");
       if(check.length>2){
       HashMap<Integer,String>hm=new HashMap<Integer,String>();
       for(int m=1; m<check.length; m++){
       for(int n=0; n<m; n++){
       int first=Integer.parseInt(check[m])-Integer.parseInt(check[n]);
       if(hm.containsKey(first)){
       String obtain=hm.get(first);
       hm.put(first,obtain+" "+check[m]+" ");
       continue;
       }
       hm.put(first,check[n]+" "+check[m]);
       }
       
       }
       //System.out.println(hm.get(3330));
       
       Set last=hm.keySet();
       Iterator<Integer> go=last.iterator();
       while(go.hasNext()){
       int key=go.next();
       String temp=hm.get(key).trim();
       String test1[]=temp.split(" ");
       if(test1.length==K&&Integer.parseInt(test1[0])<N){
       String ans="";
       int count=0;
       for(int p=test1.length-1; p>1; p--){
       int x=Integer.parseInt(test1[p])-Integer.parseInt(test1[p-1]);
       int y=Integer.parseInt(test1[p-1])-Integer.parseInt(test1[p-2]);
       if(x==y){
       count++;
       }
       }
       if(K==3&&count==1){
       for(int k=0; k<test1.length; k++){
       ans+=test1[k];
       }
      // System.out.println(ans.trim());
       op.addElement(ans);
       }
       if(K==4&&count==3){
       for(int k=0; k<test1.length; k++){
       ans+=test1[k];
       }
       
       op.addElement(ans); 
       }
       }
       }
       
       }
       }
       
       }
       Object arrange[]=op.toArray();
       Arrays.sort(arrange);
       for(int u=0; u<arrange.length; u++){
       System.out.println(arrange[u].toString().trim());
       }
       }
       
}
