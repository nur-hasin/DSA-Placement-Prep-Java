import java.util.*;

public class SqArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = (side * side);
        System.out.println("Area of the square is: " + area);
        sc.close();
    } 
}
