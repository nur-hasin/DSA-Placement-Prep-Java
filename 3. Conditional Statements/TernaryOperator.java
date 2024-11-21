public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 5, num2 = 3;

        int larger = (num1 > num2) ? num1 : num2;
        System.out.println(larger);

        String type = (num1 % 2 == 0) ? "even" : "add";
        System.out.println(type);
    }
} 

