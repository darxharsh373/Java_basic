import java.util.*;
public class subarray{
    public static void Psubarray(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start =numbers[i];
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is:"+ts);
    }
public static void main(String args[]){
int numbers[]={2,4,6,8,10};
Psubarray(numbers);
}
}