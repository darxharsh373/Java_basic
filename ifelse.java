import java.util.*;
public class ifelse{
public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 System.out.println("enter your age:");
 int age = sc.nextInt();
 if(age>=18){
    System.out.println("you are adult now:");
    
    
 }
else if(age>=13&&age<=18){
    System.out.println("You are in teenage.");
    
}  
else{
    System.out.println("you are a child:");
}
}
}