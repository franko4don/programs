/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testit;

/**
 *
 * @author FRANKCHUKY
 */
public class Testit {

    /**
     * @param args the command line arguments
     */
     public boolean partition(int arr[]){
        int sum =0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        
        if(sum % 2 != 0){
            return false;
        }
        sum = sum/2;
        boolean[][] T = new boolean[arr.length+1][sum+1];
        
        for(int i=0; i <= arr.length; i++){
            T[i][0] = true;
        }
        
        for(int i=1; i <= arr.length; i++){
            for(int j=1; j <= sum; j++){
                if(j - arr[i-1] >= 0){
                    T[i][j] = T[i-1][j - arr[i-1]] || T[i-1][j];
                }
            }
        }
        return T[arr.length][sum];
    }
    
    public static void main(String args[]){
        Testit ss = new Testit();
        int arr[] = {1,3,5,5,2,1,1,6};
        boolean r = ss.partition(arr);
        System.out.print(r);
    }
}
