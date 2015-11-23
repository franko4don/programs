/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shorteningintherealworld;
import java.util.*;
import java.math.*;
import javax.xml.bind.DatatypeConverter;
/**
 *
 * @author FRANKCHUKY
 */
public class Shorteningintherealworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String baseurl=sc.next();
        String temp=baseurl;
        int N=sc.nextInt();
        for(int i=0; i<N; i++){
        baseurl=temp;
        String targeturl=sc.next();
        if(targeturl.length()<=baseurl.length()){
        baseurl=baseurl.substring(0, targeturl.length());
        }else{
        int length=targeturl.length()-baseurl.length();
        for(int j=0; j<length; j++){
        baseurl+=String.valueOf(temp.charAt(j%temp.length()));
        }
        }
        
        BigInteger[]base=new BigInteger[baseurl.length()];
        BigInteger[]target=new BigInteger[baseurl.length()];
        BigInteger[]xorvalue=new BigInteger[baseurl.length()];
        String comp[]=new String[baseurl.length()];
        for(int l=0; l<base.length; l++){
        String one=Integer.toHexString((int)baseurl.charAt(l));
        base[l]=new BigInteger(one,16);
        String two=Integer.toHexString((int)targeturl.charAt(l));
        target[l]=new BigInteger(two,16);
        xorvalue[l]=base[l].xor(target[l]);
        comp[l]=xorvalue[l].toString(16);
        if(comp[l].length()==1){
        comp[l]="0"+comp[l];
        }
        }
        String last8="";
        for(int m=comp.length-1; m>comp.length-9; m--){
        last8=comp[m]+last8;
        }
        
        BigInteger acc=new BigInteger(last8,16);      
        System.out.println(temp+"/"+Base62(acc.longValue()));
        }
    }
    
    //conversion to base62
    public static String Base62(long process){
    HashMap<Long,Character>hm=new HashMap<Long,Character>();
    String answer="";
    char num='0';
    for(long i=0; i<10; i++){
    hm.put(i, num);
    num+=1;
    }
    char low='a';
    for(long i=10; i<36; i++){
    hm.put(i, low);
    low+=1;
    }
    char high='A';
    for(long i=36; i<62; i++){
    hm.put(i, high);
    high+=1;
    }
    while(process!=0){
    long mod=process%62;
    answer=hm.get(mod)+answer;
    process/=62;
    }
    return answer;
    }
}
