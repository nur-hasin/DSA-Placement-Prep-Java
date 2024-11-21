import java.util.*;

public class CreateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a: ");
    int a = sc.nextInt();

    System.out.println("Enter b: ");
    int b = sc.nextInt();

    System.out.println("Enter the operator: ");
    char operator = sc.next().charAt(0);

    sc.close();

    switch (operator) {
        case '+':
            System.out.println(a + b);
            break;
        case '-':
            System.out.println(a - b);
            break; 
        case '*':
            System.out.println(a * b);
            break; 
        case '/':
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(a / b);
            }
            break;
        case '%':
            if (b == 0) {
                System.out.println("Cannot find remainder by zero");
            } else {
                System.out.println(a % b);
            }
            break;
        default:
            System.out.println("Invalid operator");
        }
    }
}
