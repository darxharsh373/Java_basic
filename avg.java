import java.util.*;
public class avg{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the three number:");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int average = (a+b+c)/3;
  System.out.println(average);
}
}