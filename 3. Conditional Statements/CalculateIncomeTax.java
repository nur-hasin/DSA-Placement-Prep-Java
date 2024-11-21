import java.util.*;

public class CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        sc.close();

        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * (20f / 100f));
        } else {
            tax = (int) (income * (30f / 100f));
        }

        System.out.println("Your income tax is: " + tax); 
    }
}
