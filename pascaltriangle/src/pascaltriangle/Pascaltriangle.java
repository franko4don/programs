/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pascaltriangle;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Pascaltriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int number[]=new int[]{0,4,2,7,15,-3,9,41,30}; 
   //  int temp[]=new int[number.length];
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
     v.set(index, i);
     R[i]=v.elementAt(index-1);
     System.out.println(index);
     }
     System.out.println(v);
     }
     
     System.out.println(Arrays.toString(R));
     System.out.print(number[v.elementAt(v.size()-1)] +" ");
     int inc=v.elementAt(v.size()-1);
     while(R[inc]!=-1){
     int pit=R[inc];
     System.out.print(number[pit]+" ");    
     inc=pit;
     }
    }
    
    public static int find(int array[],long key,int size,Vector<Integer>v){
    int start=0;
    int end=size;
    boolean found=true;
    while(found){
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
