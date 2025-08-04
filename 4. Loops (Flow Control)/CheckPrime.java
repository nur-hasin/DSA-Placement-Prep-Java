import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime");
        } else if (n == 2) {
            System.out.println(n + " is a prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(n + " is a prime");
            } else {
                System.out.println(n + " is not a prime");
            }
        }

        sc.close();
    }
}
