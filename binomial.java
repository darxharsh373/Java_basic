import java.util.*;
public class binomial{
    public class factorial{
    public static int factorial(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            x=x*i;

        }
        return x;
    }
    public static int bincoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bincoeff=fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter 'n' and 'r' :");
int n=sc.nextInt();
int r=sc.nextInt();
int B=bincoeff(n,r);
System.out.println("Binomial coefficient is :"+B);
}
}}