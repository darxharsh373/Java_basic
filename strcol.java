import java.util.Scanner;

public class strcol {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s1 = scan.next(); // Read the string
                int x = scan.nextInt(); // Read the integer
                
                // Print the formatted output
                System.out.printf("%-15s%03d%n", s1, x);
            }   System.out.println("================================");
            // Close the scanner
        }
    }
}
