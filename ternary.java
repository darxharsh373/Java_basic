import java.util.*;
public class ternary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check even or odd:");
int n=sc.nextInt();
String type=((n%2)==0)?"the number is even.":"the number is odd.";
System.out.println(type);
}
}