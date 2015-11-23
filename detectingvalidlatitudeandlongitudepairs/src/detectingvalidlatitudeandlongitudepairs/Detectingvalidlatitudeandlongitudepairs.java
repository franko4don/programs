/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package detectingvalidlatitudeandlongitudepairs;
import java.util.*;
import java.io.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Detectingvalidlatitudeandlongitudepairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       Scanner sc=new Scanner(System.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String times=br.readLine();
       int N=Integer.parseInt(times);      
       for(int i=0; i<N; i++){
       String get=br.readLine();
       String temp="";
       String x="";
       String y="";
       String main=get.substring(1,get.length());
       for(int j=0; j<main.length(); j++){
       if(main.charAt(j)==','){
       x=temp;
       temp="";
       continue;
       }
       if(main.charAt(j)==')'){
       y=temp.trim();
       temp="";
       }
       temp+=main.charAt(j);
       }
       double X=Double.parseDouble(x);
       double Y=Double.parseDouble(y);
       if(x.charAt(x.length()-1)=='.'||y.charAt(y.length()-1)=='.'){
       System.out.println("Invalid");
       continue;
       }
       if(x.contains("+")||x.contains("-")){
       if(x.charAt(1)=='0'){
       System.out.println("Invalid");
       continue;
       }
       }
       
       if(y.contains("+")||y.contains("-")){
       if(y.charAt(1)=='0'){
       System.out.println("Invalid");
       continue;
       }
       }
       
       if(x.charAt(0)=='0'||y.charAt(0)=='0'){
       System.out.println("Invalid");
       continue;
       }
       
       if((X>=-90&&X<=90)&&(Y>=-180&&Y<=180)){
       System.out.println("Valid");
       }else{
       System.out.println("Invalid");
       }
       
       }
    }
}
