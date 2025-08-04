import java.util.*;

public class FactCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        System.out.println("The factorial is: " + fact);

        sc.close();
    }
}
