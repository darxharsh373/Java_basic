 import java.util.*;
 public class jbasic{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    // next is used to store input only single word
    System.out.println(input);
    String name =sc.nextLine();
    System.out.println(name);
    nextLine is used to store input whole line 
    int number =sc.nextInt();
    System.out.println(number);

 float price =sc.nextFloat();
 System.out.println(price);

 boolean x =sc.nextBoolean();
 System.out.println(x);
 short y=sc.nextShort();
 System.out.println(y);

 long z=sc.nextLong();
 System.out.println(z);


}
}