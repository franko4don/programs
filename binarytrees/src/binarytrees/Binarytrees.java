/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;

/**
 *
 * @author FRANKCHUKY
 */
public class Binarytrees {
    Node root;
    
    public void addNode(int key,String name){
    Node newNode=new Node(key,name);
    if(root==null){
    root=newNode;
    }else{
    Node focusNode=root;
    Node parent;
    while(true){
    parent=focusNode;
    if(key<focusNode.data){
    focusNode=focusNode.LeftChild;
    if(focusNode==null){
    parent.LeftChild=newNode;
    return;
    }
    }else{
    focusNode=focusNode.RightChild;
    if(focusNode==null){
    parent.RightChild=newNode;
    return;
    }
    }
    }
    }
    }
    
    void inordertraversetree(Node focusNode){
     if(focusNode!=null){
     inordertraversetree(focusNode.LeftChild);
     System.out.println(focusNode.ConvertToString());
     inordertraversetree(focusNode.RightChild);
     }
     }
     
     void preordertraversetree(Node focusnode){
     if(focusnode!=null){
     System.out.println(focusnode.ConvertToString());
     preordertraversetree(focusnode.LeftChild);    
     preordertraversetree(focusnode.RightChild);
     }
     }
     
     void postordertraversetree(Node focusnode){
     if(focusnode!=null){
     postordertraversetree(focusnode.LeftChild);    
     postordertraversetree(focusnode.RightChild);
     System.out.println(focusnode.ConvertToString());
     }
     }
    
    public static void main(String[] args) {
     Binarytrees tree=new Binarytrees();
     tree.addNode(50,"boss");
     tree.addNode(25,"vice pres");
     tree.addNode(15,"office manager");
     tree.addNode(30,"secretary");
     tree.addNode(75,"sales manager");
     tree.addNode(85,"salesman 1");
     tree.postordertraversetree(tree.root);   
    }
    
    public boolean remove(int key){
    Node focusNode=root;
    Node parent=root;
    boolean isItLeftChild=true;
    while(focusNode.data!=key){
    parent=focusNode;
    if(key<focusNode.data){
    isItLeftChild=true;
    focusNode=focusNode.LeftChild;
    }else{
    isItLeftChild=false;
    focusNode=focusNode.RightChild;
    }
    if(focusNode==null){
    return false;
    }
    }
    return isItLeftChild;
    }
    
}
    class Node{
    int data;
    String name;
    Node LeftChild;
    Node RightChild;
    Node(int key,String name){
    this.data=key;
    this.name=name;    
    }
    public String ConvertToString(){
    String get=name+" has a key of "+data;
    return get;
    }
    }

