/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author FRANKCHUKY
 */
public class ONE {
    static int abvone[]=new int[]{0,1,2,3,4,5,6,7,8,9};
  static String oneabv[]=new String[]{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
  static String twentyabv[]=new String[]{" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
  static int abvten[]=new int[]{10,11,12,13,14,15,16,17,18,19};
  static String tenabv[]=new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
  static String hundredabv[]=new String[]{"","Hundred","Thousand","Million","Billion","Trillion"};
  static  StringBuilder get;
  static String numbers[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Vector<String> v=new Vector<String>();
        for(int k=0; k<T; k++){
        
        String op=sc.next();
        if(op.equals("0")){
        System.out.println("zero");
        continue;
        }
        get=call(op);
        numbers=get.toString().split(",");
        String store[]=null;
        if(numbers.length==1){
        store=hundreds().split(" ");
        }
        String finalanswer="";
        for(int j=0; j<store.length; j++){
        if(store[j].equals("")){
        continue;
        }
        finalanswer+=store[j]+" ";
        }
        v.addElement(finalanswer.trim());
        }
        for(int x=0; x<v.size(); x++){
        String ans="";
        for(int j=0; j<v.elementAt(x).length(); j++){
        if(v.elementAt(x).charAt(j)==' ')continue;
        ans+=String.valueOf(v.elementAt(x).charAt(j));
        }
       
        if(ans.toLowerCase().equals("onehundred")){
        System.out.println(ans.toLowerCase().substring(3));
        }else{
       System.out.println(ans.toLowerCase());
        }
        
        }
    }
    private static StringBuilder call(String n){
    StringBuilder sb=new StringBuilder();
    sb.append(n);
    int count=sb.length();
    String check="";
    for(int i=count-1; i>=0; i--){
    check+=sb.charAt(i);
    if(check.length()==3&&i!=0){
    sb.insert(i,',');
    check="";
    }   
    }
    return sb;        
    }
    private static String hundreds(){
        StringBuilder answer=new StringBuilder();
        int index=numbers.length-1;
        String values=numbers[index];
        if(values.length()==1){
        int getnumber=Character.getNumericValue(values.charAt(0));
        answer.append(oneabv[getnumber]).append(" ");
        }
        if(values.length()==2){
        if(Character.getNumericValue(values.charAt(0))==1){
        int gettwo=Integer.parseInt(values);
        int position=Arrays.binarySearch(abvten,gettwo);
        answer.append(tenabv[position]).append(" ");
        }else{
        int getnumber1=Character.getNumericValue(values.charAt(0));
        answer.append(twentyabv[getnumber1]).append(" ");
        int getnumber2=Character.getNumericValue(values.charAt(1));
        answer.append(oneabv[getnumber2]).append(" ");
        }
        }
        if(values.length()==3){
           int first=Character.getNumericValue(values.charAt(0));
           int second=Character.getNumericValue(values.charAt(1));
           int third=Character.getNumericValue(values.charAt(2));
        if(first==0&&second==1){
        int gettwo=Integer.parseInt(values.substring(1));
        int position=Arrays.binarySearch(abvten,gettwo);
        answer.append(tenabv[position]).append(" ");
        }
        if(first==0&&second==0&&third!=0){
        int getnumber2=Character.getNumericValue(values.charAt(2));
        answer.append(oneabv[getnumber2]).append(" ");
        }
        if(first==0&&second!=0&&second!=1){
        int getnumber1=Character.getNumericValue(values.charAt(1));
        answer.append(twentyabv[getnumber1]).append(" ");
        int getnumber2=Character.getNumericValue(values.charAt(2));
        answer.append(oneabv[getnumber2]).append(" ");
        }
        if(first!=0){
        answer.append(oneabv[first]).append(" ");
        answer.append(hundredabv[1]).append(" ");
        if(second==0){
        int getnumber2=Character.getNumericValue(values.charAt(2));
        answer.append(oneabv[getnumber2]).append(" ");
        }
        if(second==1){
        int gettwo=Integer.parseInt(values.substring(1));
        int position=Arrays.binarySearch(abvten,gettwo);
        answer.append(tenabv[position]).append(" ");
        }
        if(second!=0&&second!=1){
        int getnumber1=Character.getNumericValue(values.charAt(1));
        answer.append(twentyabv[getnumber1]).append(" ");
        int getnumber2=Character.getNumericValue(values.charAt(2));
        answer.append(oneabv[getnumber2]).append(" ");
        }
        }
        }
        String ans1=answer.toString().trim();
        return ans1;
    }
}
