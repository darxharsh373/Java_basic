import java.util.*;
public class swapfun{
    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter two number to swap:");
int a=sc.nextInt();
int b=sc.nextInt();
swap(a,b);
}
}