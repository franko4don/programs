/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionequality;

/**
 *
 * @author FRANKCHUKY
 */
public class Fractionequality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int P=10010101;
        int Q=11111117;
        for(int i=0; i<P+Q; i++){
        for(int j=1; j<P+Q; j++){
        double first=Math.abs(P-i);
        double second=Math.abs(Q+j);
        double third=Math.abs(P+j);
        double fourth=Math.abs(Q-i);
        int check1=0;
        int check2=0;
      /**  if(second>first){
        check1=gcd(first,second);
        }else{
        check1=gcd(second,first);
        }
        if(fourth>third){
        check2=gcd(third,fourth);
        }else{
        check2=gcd(fourth,third);
        }
        double one=(Math.abs(P-i))/check1;
        double two=Math.abs((Q+j))/check1;
        double three=Math.abs((P+j))/check2;
        double four=Math.abs((Q-i))/check2;*/
        if((first/second)==(third/fourth)){
        System.out.println(i+" "+j);
        }
        }
        }
    }
   public static int gcd(int x,int y){
   if(y==0){
   return x;
   }else{
   return gcd(y,x%y);
   }
   }
}
