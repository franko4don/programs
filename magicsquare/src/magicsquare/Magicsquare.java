/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Magicsquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int number[][]=new int[N][N];
       for(int i=0; i<N; i++){
       for(int j=0; j<N; j++){
       number[i][j]=sc.nextInt();
       }
       }
       //HashMap<Integer,Long>hm=new HashMap<Long,Long>();
       Vector<Integer>v=new Vector<Integer>();
       //sum of main diagonal
       long sumdiag=0;
       for(int i=0; i<N; i++){
       for(int j=i; j<=i; j++){
       sumdiag+=number[i][j];
       }
       }
       //traversing the rows
       for(int i=0; i<N; i++){
       long sumrows=0;
       for(int j=0; j<N; j++){
       sumrows+=number[i][j];
       }
       if(sumrows!=sumdiag){
       v.addElement(i+1);
       }
       }
       //traversing columns
       for(int i=0; i<N; i++){
       long sumcolumns=0;
       for(int j=0; j<N; j++){
       sumcolumns+=number[j][i];
       }
       if(sumcolumns!=sumdiag){
       v.addElement(-1*(i+1));
       }
       }
       //traversing anti diagonal
       long sumantidiag=0;
       for(int i=0; i<N; i++){
       for(int j=N-1-i; j>=N-1-i; j--){
       sumantidiag+=number[i][j];
       }
       }
       if(sumantidiag!=sumdiag){
       v.addElement(0);
       }
       if(v.isEmpty()){
       System.out.println(0);
       }else{
       Object sort[]=v.toArray();
       Arrays.sort(sort);
       System.out.println(v.size());
       for(int i=0; i<v.size(); i++){
       System.out.println(sort[i]);
       }
       }
      // System.out.println(sumdiag);
    }
}
