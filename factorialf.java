import java.util.*;
public class factorialf{
    public static int factorial(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            x=x*i;

        }
        return x;
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter n to find its factorial:");
int n=sc.nextInt();
int f=factorial(n);
System.out.println("Factorial is :"+f);
}
}