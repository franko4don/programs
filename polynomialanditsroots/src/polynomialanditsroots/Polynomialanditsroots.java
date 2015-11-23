/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomialanditsroots;
import java.util.*;
/**
 *
 * @author FnRANKCHUKY
 */
public class Polynomialanditsroots {
static long sum=0;
 static long product=1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt()+1;
        Vector<Long> numbers=new Vector<Long>();
        numbers.setSize(N);
        for(int i=N-1; i>=0; i--){
        numbers.set(i, sc.nextLong());
        }
        rootsumproduct(numbers);
        
    }
    public static String rootsumproduct(Vector<Long> a){
    //System.out.println(a);
    if(a.size()==1){
    System.out.println(product+" "+sum);
    System.exit(0);
    }
    
    for(int i=-1000; i<=1000; i++){
    long root=0;
    for(int j=0; j<a.size(); j++){
    root+=a.elementAt(j) *(Math.pow(i, a.size()-1-j));
    }
    if(root==0){
    sum+=i;
    product*=i;
    Vector <Long>divider=new Vector<Long>();
    Vector <Long>quotient=new Vector<Long>();
    Vector <Long>temp=a; 
    divider.addElement(1L);
    divider.addElement((long)-i);
    for(int l=0; l<a.size()-2; l++){
    divider.addElement(0L);
    }
    for(int k=0; k<a.size()-1; k++){
    quotient.addElement(temp.elementAt(k)/1L);//gets the quotient
    for(int m=0; m<divider.size(); m++){   
    temp.set(m,a.elementAt(m)-(quotient.elementAt(k)*divider.elementAt(m)));
    }
    divider.removeElementAt(divider.size()-1);
    divider.add(0,0L);
    int count=0;
    for(int t=0; t<temp.size(); t++){
    if(temp.elementAt(t)==0){
    count++;
    }
    }
    }
    if(a.size()!=1){
    rootsumproduct(quotient);
    }
    }
    }
    return sum+" "+product;
    }
}
