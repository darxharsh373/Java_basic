import java.util.*;
public class passfai{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
    System.out.println("enter your marks:");
    int marks=sc.nextInt();
    String reportCard= marks>=33?"pass":"fail";
    System.out.println(reportCard);

}
}
