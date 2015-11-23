/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package preorder;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Preorder {
 Node root;
public void addnode(int key){
Node newNode=new Node(key);
if(root==null){
root=newNode;
}else{
Node focusnode=root;
Node parent;
while(true){
parent=focusnode;
if(key<=focusnode.key){
focusnode=focusnode.leftchild;
if(focusnode==null){
parent.leftchild=newNode;
return;
}
}else{
focusnode=focusnode.rightchild;
if(focusnode==null){
parent.rightchild=newNode;
return;
}
}
}
}
 
}
      
     void inordertraversetree(Node focusnode){
     if(focusnode!=null){
     inordertraversetree(focusnode.leftchild);
     System.out.println(focusnode.tostring());
     inordertraversetree(focusnode.rightchild);
     }
     }
     
     void preordertraversetree(Node focusnode){
     if(focusnode!=null){
    // System.out.println(focusnode.tostring());
     v2.addElement(Integer.parseInt(focusnode.tostring()));
     preordertraversetree(focusnode.leftchild);    
     preordertraversetree(focusnode.rightchild);
     }
     }
     
     void postordertraversetree(Node focusnode){
     if(focusnode!=null){
     postordertraversetree(focusnode.leftchild);    
     postordertraversetree(focusnode.rightchild);
     System.out.println(focusnode.tostring());
     }
     }
     
     Node findnode(int key){
     Node focusnode=root;
     while(focusnode.key!=key){
     if(key<focusnode.key){
     focusnode=focusnode.leftchild;
     }else{
     focusnode=focusnode.rightchild;
     }
     if(focusnode==null){
     return null;
     }
     }
     return focusnode;
     }
    /**
     * @param args the command line arguments
     */
     static Vector<Integer> v1=new Vector<Integer>();
     static Vector<Integer> v2=new Vector<Integer>();
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Preorder thetree=new Preorder();
      int cases=1;
      while(sc.hasNext()){
      int put=sc.nextInt();
      if(put>0){
      v1.addElement(put);
      thetree.addnode(put);
      }else{
      thetree.preordertraversetree(thetree.root);
    //  System.out.println(v1);
    //  System.out.println(v2);
      if(v1.equals(v2)){
      System.out.println("Case "+cases+": yes");
      }else{
      System.out.println("Case "+cases+": no");
      }
      cases++;
      Preorder process=new Preorder();
      thetree=process;
      v2=new Vector<Integer>();
      v1=new Vector<Integer>();
      }
      }
    }
}

    class Node{
    int key;
    String name;
    Node leftchild;
    Node rightchild;
    
    Node(int key){
      this.key=key;
    }
    public String tostring(){
    String get=""+key;
    return get;
    }
}
