/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smithnumbers;

/**
 *
 * @author FRANKCHUKY
 */
public class Smithnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []numbers=new int[8];
        numbers[0]=1;
        numbers[1]=3;
        numbers[2]=5;
        numbers[3]=7;
        numbers[4]=9;
        numbers[5]=11;
        numbers[6]=13;
        numbers[7]=15;
        int count=0;
       // System.out.println(numbers.length);
        for(int i=0; i<8; i++){
        for(int j=0; j<8; j++){ 
        for(int k=0; k<8; k++){
        int add=numbers[i]+numbers[j]+numbers[k];
        count++;
         System.out.println(add);
        
        }
        }
        }
        System.out.println(count);
        }
           
}
