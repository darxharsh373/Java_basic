import java.util.*;
public class holllowrect{
    public static void h_rectangle(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
System.out.println("enter the number of line:");
int x=sc.nextInt();
int y=sc.nextInt();
h_rectangle(x,y);
}
}