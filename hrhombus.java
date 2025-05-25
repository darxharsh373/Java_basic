import java.util.*;
public class hrhombus{
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==i||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.println("enter number of lines:");
    int n=sc.nextInt();
    rhombus(n);
}
}