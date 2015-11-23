/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package segmenttree;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class SegmentTree {

    /**
     * @param args the command line arguments
     */
    static int []get=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val[]=new int[]{-1,2,4,0};
        int N=SegmentArray(val);
        int segment[]=new int[N];
        ConstructTree(val,segment,0,val.length-1,0);
        System.out.println(Arrays.toString(get));
    }
    
    public static int SegmentArray(int number[]){
    Vector<Integer>v=new Vector<Integer>();
    int length=0;
    for(int i=0; i<32; i++){
    v.addElement((int)Math.pow(2, i));
    }
    for(int j=0; j<v.size(); j++){
    if(v.elementAt(j)==number.length){
    length=v.elementAt(j);
    length=(length*2)-1;
    break;
    }
    if(v.elementAt(j)>number.length){
    length=v.elementAt(j);
    length=(length*2)-1;
    break;
    }
    }
    return length;
    }
    static void ConstructTree(int input[],int segtree[],int low,int high,int pos){
    if(low==high){
    segtree[pos]=input[low];
    return;
    }
    int mid=(low+high)/2;
    ConstructTree(input,segtree,low,mid,2*pos+1);
    ConstructTree(input,segtree,mid+1,high,2*pos+2);
    segtree[pos]=Math.min(segtree[2*pos+1], segtree[2*pos+2]);
    get=segtree;
    }
}
