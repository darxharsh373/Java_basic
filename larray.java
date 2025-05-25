import java.util.*;
public class larray{
    public static int getl(int n[]){
        int largest =Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//Infinity
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
            if(smallest>n[i]){
                smallest=n[i];
            }
        }
        System.out.println("smallest no is:"+smallest);
        return largest;
    }
public static void main(String args[]){
int n[]={1,2,6,3,5};
System.out.println("largest vallue is:"+getl(n));
}
}