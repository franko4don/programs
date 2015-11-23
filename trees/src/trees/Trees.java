/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author FRANKCHUKY
 */
public class Trees {
 Node root;
public void addnode(int key,String name){
Node newNode=new Node(key,name);
if(root==null){
root=newNode;
}else{
Node focusnode=root;
Node parent;
while(true){
parent=focusnode;
if(key<focusnode.key){
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
     System.out.println(focusnode.tostring());
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
    public static void main(String[] args) {
      Trees thetree=new Trees();
      thetree.addnode(50,"boss");
      thetree.addnode(25,"vice pres");
      thetree.addnode(15,"office manager");
      thetree.addnode(30,"secretary");
      thetree.addnode(75,"sales manager");
      thetree.addnode(85,"salesman 1");
    //  thetree.inordertraversetree(thetree.root);
    }
}

    class Node{
    int key;
    String name;
    Node leftchild;
    Node rightchild;
    
    Node(int key,String name){
      this.key=key;
      this.name=name;
    }
    public String tostring(){
    String get=name+" has a key "+key;
    return get;
    }
    }

