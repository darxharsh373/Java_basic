import java.util.*;
public class floyds_traingle{
    public static void f_traingle(int n){
        int c=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of lines:");
    int n=sc.nextInt();
    f_traingle(n);

}
}