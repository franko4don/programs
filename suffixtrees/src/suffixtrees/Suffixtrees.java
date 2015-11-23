/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suffixtrees;

import java.util.Scanner;

/**
 *
 * @author FRANKCHUKY
 */
public class Suffixtrees {
   Node head;
   Node depth;
public void addNode(String name,int key){
    Node newNode=new Node(name,key);
   if(head==null){
   head=newNode;
   }else{
   
   }
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Suffixtrees st=new Suffixtrees();
       String ad=sc.next();
       for(int i=0; i<ad.length(); i++){
       String put=ad.substring(i, i+1);
       st.addNode(put, i);
       }
    }
} 

    class Node{  
    Node down;
    Node next;
    String text;
    int key;  
    public Node(String input,int position){
    this.text=input;
    this.key=position;
    }
    
}
