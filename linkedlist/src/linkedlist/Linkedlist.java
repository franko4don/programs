/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author FRANKCHUKY
 */
public class Linkedlist {

    Node head;
    public void addvalue(int key){
    Node addto=new Node(key);
    if(head==null){
    head=addto;   
    }else{
    Node focusNode=head;
    while(true){   
    if(focusNode.next==null){
    focusNode.next=addto;   
    return;
    }else{
    focusNode=focusNode.next;
    }
    }
    }
   // System.out.println(head.tostring());
    }
    
    void printNodeInOrder(Node focus){
    if(focus!=null){  
    System.out.println(focus.tostring());
    printNodeInOrder(focus.next);   
    }
    }
    
    int getNode(Node head,int n){
    if(n!=0){
    n-=1;
    return getNode(head.next,n);
    
    }else{
    return head.data;
    }
    }
    
    void printNodeInReverseOrder(Node focus){
    if(focus!=null){  
    System.out.println(focus.tostring());
    printNodeInReverseOrder(focus.next);   
    }
    }
    
    Node InsertNodeAtTail(Node head,int data){
    Node newNode=new Node(data);
    if(head==null){
    newNode.data=data;
    head=newNode;
    return head;
    }else{
    Node focusNode=head;
    while(true){   
    if(focusNode.next==null){ 
    newNode.data=data;
    focusNode.next=newNode; 
    head=focusNode;
    return head;
    }else{
    focusNode=focusNode.next;
    }
    }
    }
    
    }
   
    
    public static void main(String[] args) {
        Linkedlist lt=new Linkedlist();
        lt.addvalue(1);
        lt.addvalue(3);
        lt.addvalue(5);
        lt.addvalue(6);
        //
       // lt.printNodeInReverseOrder(lt.head);
        lt.printNodeInOrder(lt.head);
        lt.InsertNodeAtTail(lt.head,39);
        lt.printNodeInOrder(lt.head);
    }
    class Node{
    Node next;
    int data;
    
    public Node(int key){
    this.data=key;
    }
    public int tostring(){
    return data;
    }
    }
}
