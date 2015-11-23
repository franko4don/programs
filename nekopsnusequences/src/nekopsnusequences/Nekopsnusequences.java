/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nekopsnusequences;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author FRANKCHUKY
 */
public class Nekopsnusequences {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        StringBuilder sb2=new StringBuilder();
        String second="";
        String main="";
        String intvalue="";
        int total=0;
        int count=1;
        int T=sc.nextInt();
        String input;  
        String[]answers=new String[T+1];
        int[]longest=new int[T+1];
       Vector v=new Vector();
       if(T==0){
        String second1=sc.nextLine().trim();
        System.out.println(second1);
        
        for(int i=0; i<second1.length(); i++){
       if(second1.charAt(i)==' '){
       total++;
       intvalue="";
       continue;
       }
       intvalue+=second1.charAt(i);
       if(i==second1.length()-1){
          total++;
       intvalue="";
       }    
     }
        System.out.println(total);
        System.exit(0);
       }
      for(int c=0; c<T; c++){
           if(c==0){
           input=sc.nextLine().trim();
           answers[c]=input.trim();
           }else{
           input=second;
           }
       for(int i=0; i<input.length(); i++){
       if(input.charAt(i)==' '){
       if(main.equals("")){
           continue;
       }
       v.addElement(Long.parseLong(main));
       main="";
       continue;
       }
       main+=input.charAt(i);
       if(i==input.length()-1){
       v.addElement(Long.parseLong(main));
       main="";
       }
       }
       for(int j=0; j<v.size()-1; j++){
       if(v.elementAt(j).equals(v.elementAt(j+1))){
       count++; 
       }
       else{
       sb2.append(count).append(" ").append(v.elementAt(j).toString()).append(" ");
       count=1;
       }
       if(j==v.size()-2){
       sb2.append(count).append(" ").append(v.elementAt(j+1).toString()).append(" ");
       count=1;
       break;
       }
       }
       
       answers[c+1]=sb2.toString().trim();
     // System.out.println(v);
       second=sb2.toString().trim();
       sb2.delete(0,sb2.length());  
       v.clear();
       }
     for(int b=0; b<longest.length; b++){
     longest[b]=answers[b].length();
     }
     Arrays.sort(longest);
      int length=longest[longest.length-1];
      for(int f=0; f<answers.length; f++){
      int value=length-answers[f].length();
      if(value==0){
      System.out.println(answers[f]);
      continue;
      }
      if(value!=0&value%2==0){
      System.out.println(repeat(".",value/2)+answers[f].trim()+repeat(".",value/2));
      }
      else{
      System.out.println(repeat(".",(value/2)+1)+answers[f].trim()+repeat(".",value/2));    
      }
      }
      
      for(int i=0; i<second.length(); i++){
       if(second.charAt(i)==' '){
       total++;
       intvalue="";
       continue;
       }
       intvalue+=second.charAt(i);
       if(i==second.length()-1){
          total++;
       intvalue="";
       }
      }
      System.out.println(total);
 }
   
 public static String repeat(String str, int times){
   return new String(new char[times]).replace("\0", str);
   
}
 
}
