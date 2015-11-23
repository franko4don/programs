/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javastack;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Javastack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String stacks[]=new String[]{"()","{}","[]"};     
       while(sc.hasNext()){
       int n=0;
       StringBuilder get=new StringBuilder().append(sc.next());
       if(get.length()%2!=0){
       System.out.println("false");
       continue;
       }
       while(get.length()%2==0&&get.length()!=0&&n<150){
       for(int i=0; i<get.length()-1; i++){
       String comp=get.substring(i,i+2);       
       for(int j=0; j<3; j++){
       if(comp.equals(stacks[j])){
       get.delete(i, i+2);
       }
       }
       }
       n++;
       }
       
       if(get.length()==0){
       System.out.println("true");
       }else{
       System.out.println("false");
       }
       }      
       }
    }

