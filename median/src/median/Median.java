/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package median;
import java.util.*;
/**
 *
 * @author FRANKCHUKY
 */
public class Median {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[]character=new String[N];
        Vector v=new Vector();
        Vector vec=new Vector();
        int[]values=new int[N];
        for(int i=0; i<N; i++){
        character[i]=sc.next();
        values[i]=sc.nextInt();
        }
        for(int j=0; j<N; j++){
        if(character[j].equals("a")){
        v.addElement(values[j]);
        if(v.size()==1){
        vec.addElement(v.elementAt(0));
        continue;
        }
        if(v.size()%2==0){
        int input[]=new int[v.size()];
         for(int m=0; m<v.size(); m++){
         input[m]=Integer.parseInt(v.elementAt(m).toString());
         }
        Arrays.sort(input);
        int length=input.length/2;
        double sum=input[length-1]+input[length];
        double ans=sum/2;
       // System.out.println(ans);
        if(ans%1!=0){
        vec.addElement(ans);
        }else{
        int whole=(int)ans;
        vec.addElement(whole);
        }
        }else{
        int input[]=new int[v.size()];
        for(int m=0; m<v.size(); m++){
         input[m]=Integer.parseInt(v.elementAt(m).toString());
         }
        Arrays.sort(input);
        vec.addElement(input[input.length/2]);
        }
        }else{
        int count=0;
        //System.out.println(v);
        for(int k=0; k<v.size(); k++){
        if(values[j]==Integer.parseInt(v.elementAt(k).toString())){
        v.removeElementAt(k);
        count++;
        break;
        }
        }
        Object[]input=v.toArray();
        Arrays.sort(input);
        if(v.isEmpty()){
        vec.addElement("Wrong!");
        }else{
            if(v.size()==1){
        vec.addElement(v.elementAt(0));
        continue;
        }
         if(v.size()%2==0){
         int input1[]=new int[v.size()];
         for(int m=0; m<v.size(); m++){
         input1[m]=Integer.parseInt(v.elementAt(m).toString());
         }
        Arrays.sort(input1);
        int length=input1.length/2;
        double sum=input1[length-1]+input1[length];
        double ans=sum/2;
       // System.out.println(ans);
        if(ans%1!=0){
        vec.addElement(ans);
        }else{
        int whole=(int)ans;
        vec.addElement(whole);
        }
        }else{
        int input1[]=new int[v.size()];
         for(int m=0; m<v.size(); m++){
         input1[m]=Integer.parseInt(v.elementAt(m).toString());
         }
        Arrays.sort(input1);
        vec.addElement(input1[input.length/2]);
        }
         }
        }
        }
        for(int l=0; l<vec.size(); l++){
        System.out.println(vec.elementAt(l));
        }
    }
}
