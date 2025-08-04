import java.util.*;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        
        do {
            System.out.print("Enter an integers: ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }

            System.out.print("Do you want to continue? Press 1 for Yes, 0 for No: ");
            choice = sc.nextInt();
        } while(choice == 1);
        
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        sc.close();
    } 
}
