/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock.and.gcd;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class SherlockAndGcd {
static int count0,count1,count2,count3,count4,h;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     Vector v=new Vector();
     for(int i=0; i<T; i++){
         int N=sc.nextInt();
         int ans[]=new int[N];
     for(int j=0; j<N; j++){
         int numbers=sc.nextInt();
         ans[j]=numbers;
     }
      h=ans[0];
     for(int low=0; low<ans.length; low++){
         if(h==1){
         h=ans[low+1];
         }
     if(ans[low]<=h){
     h=ans[low];
       if(h==1)continue;
     }
    // System.out.println(h);
     }
     for(int k=0; k<ans.length; k++){
     if(ans[k]%h==0&&ans[k]>=h){
     count0+=1;
     }
     if(ans[k]%2==0&&ans[k]>=2){
     count1+=1;
     }
     if(ans[k]%3==0&&ans[k]>=3){
     count2+=1;
     }
     if(ans[k]%5==0&&ans[k]>=5){
     count3+=1;
     }
     if(ans[k]%7==0&&ans[k]>=7){
     count4+=1;
     }
     }
     if(count0==ans.length||count1==ans.length||count2==ans.length||count3==ans.length||count4==ans.length){
     v.addElement("NO");
     }else{
     v.addElement("YES");
     }
     count0=0; count1=0; count2=0; count3=0; count4=0;
     }
     for(int k=0; k<v.size(); k++){
     System.out.println(v.elementAt(k));
     }
    }
}
