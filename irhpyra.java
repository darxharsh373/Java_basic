import java.util.*;
public class irhpyra{
    public static void i_r_h_pyra(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter the number of line:");
int x=sc.nextInt();
i_r_h_pyra(x);
}
}