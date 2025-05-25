import java.util.*;
public class logicalopt{
public static void main(String args[]){
 Scanner sc =new Scanner(System.in);
 System.out.println("enter a b c and d to check:");
 int a=sc.nextInt();
  int b=sc.nextInt();
   int c=sc.nextInt();
    int d=sc.nextInt();
    System.out.println((a<b&&c<d));
     System.out.println((a<b||c<d));
      System.out.println(!(a<b&&c<d));
}
}