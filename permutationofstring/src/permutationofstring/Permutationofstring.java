/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationofstring;

/**
 *
 * @author FRANKCHUKY
 */
public class Permutationofstring {
static long y=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        permutation("","00111");
    System.out.println(y);
    }
    private static void permutation(String prefix,String str){
    int n=str.length();
    if(n==0){
    if(prefix.charAt(0)=='1'){
    System.out.println(prefix+" ");
    y++;
    }
    }else{
    for(int i=0; i<n; i++){
    permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
   
    }
    }
    }
}
