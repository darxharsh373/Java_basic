import java.util.*;
public class incomecalc{
public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
  System.out.println("enter your annual income:");

  double income =sc.nextDouble();
  double tax;
if(income<500000){
    tax=0;
    System.out.println("Your tax is :"+tax);

}
else if(income>=500000&&income<=1000000){
     tax=income*0.2;
     System.out.println("your tax to be paid is :"+tax);
     

}
else{
    tax=income*0.3;
    System.out.println("your tax to be paid is:"+tax);
    
}
}
}