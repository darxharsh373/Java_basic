import java.util.*;

class Qseries{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum=a;
            for(int j=0;j<n;j++){
                sum+=Math.pow(2,j)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
// }You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.