/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingalist;

import java.util.*;

/**
 *
 * @author FRANKCHUKY
 */
public class Buildingalist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int T=sc.nextInt(); 
    for(int i=0; i<T; i++){
    HashSet<String> hs=new HashSet<String>();
    int N=sc.nextInt();
    String main=sc.next();
    char op[]=main.toCharArray();
    for(int n=0; n<main.length(); n++){
    hs.add(String.valueOf(op[n]));
    }
    for(int j=0; j<N; j++){
    String temp=String.valueOf(main.charAt(j));
    for(int k=1; k<N-j; k++){
    for(int m=j+1; m<N-k+1; m++){
    String add=temp+main.substring(m, m+k);
    hs.add(add);
    }
    }   
    }
    Object sort[]=hs.toArray();
    Arrays.sort(sort);
    for(int x=0; x<sort.length; x++){
    System.out.println(sort[x]);
    }
}
    }
}