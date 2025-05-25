import java.util.*;
public class prime{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter no to check whether it is prime or not:");
int n=sc.nextInt();
if(n==2){
    System.out.println("n is prime:");}
    else{
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("n is prime");
        }else{
            System.out.println(" n is not a prime no.");
        }
    }
}
}
