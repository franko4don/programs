/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggerisgreater;
import java.util.Scanner;
public class Biggerisgreater {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       String answer[]=new String[T];
       for(int i=0; i<T; i++){    
       String lexo=sc.next();
       StringBuilder build=new StringBuilder();
       build.append(lexo);
       for(int j=build.length()-1; j>=0; j--){
       if(build.charAt(j)<build.charAt(build.length()-1)){
       build.append(build.charAt(j));     
       build.deleteCharAt(j);
       answer[i]=build.toString();
       break;
       }
       }
       build.delete(0,build.length());
       }
       for(int k=0; k<answer.length; k++){
           if(answer[k]==null){
            System.out.println("no answer");
           continue;}
       System.out.println(answer[k]);
    }
    }
}
