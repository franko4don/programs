/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package longestincreasingsubsequenceusingbinarysearch;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Longestincreasingsubsequenceusingbinarysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int number[]=new int[N]; 
    for(int i=0; i<N; i++){
    number[i]=sc.nextInt();
    }
    StringBuilder sb=new StringBuilder();
     int R[]=new int[number.length];
     Vector<Integer>v=new Vector<Integer>();
     
     v.addElement(0);
     Arrays.fill(R, -1);
     int length=0;
     for(int i=1; i<number.length; i++){
     
     if(number[i]==number[v.elementAt(v.size()-1)]){
     continue;
     }         
     if(number[i]>number[v.elementAt(v.size()-1)]){
     R[i]=v.elementAt(v.size()-1);
     v.addElement(i);    
     length++;
     
     }else{
     if(number[i]<number[v.elementAt(0)]){
     v.set(0, i);
     }
     }
     if(number[i]<number[v.elementAt(v.size()-1)]&&number[i]>number[v.elementAt(0)]){
     int index=find(number,number[i],v.size()-1,v);
     if(index==-1)continue;
     v.set(index, i);
     R[i]=v.elementAt(index-1);
     }
     }
   //  System.out.print(number[v.elementAt(v.size()-1)] +" ");
     sb.append(" ").append(number[v.elementAt(v.size()-1)]);
     int inc=v.elementAt(v.size()-1);
     while(R[inc]!=-1){
     int pit=R[inc];
     
     sb.append(" ").append(number[pit]);
     inc=pit;
     }
      System.out.println(length+1);
    }
    
    public static int find(int array[],long key,int size,Vector<Integer>v){
    int start=0;
    int end=size;
    boolean found=true;
    while(found){
    if(array[v.elementAt(end)]==key){
    return -1;
    }
    if(array[v.elementAt(end)]>key){ 
    if(key>array[v.elementAt(end-1)]){
    return end;
    }
    start=end;
    end/=2;
    
    }else{
    if(array[v.elementAt(end)]<key){
    if(array[v.elementAt(end+1)]>key){
    return end+1;
    }
    end=(end+start)/2;   
    }
    }
    }
    return 1;
    }
    }
