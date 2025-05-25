import java.util.*;
public class leapyear{
public static void main(String args[]){
 Scanner sc =new Scanner(System.in);
 System.out.println("enter the year:");
  int year=sc.nextInt();
  boolean x=(year%4)==0;
  boolean y=(year%100)!=0;
  boolean z=((year%100==0)&&(year%400==0));
  if(x&&(y||z)){
    System.out.println("This year is a leap year");
  }
  else{
    System.out.println("this year is not a leap year");
  }
}
}