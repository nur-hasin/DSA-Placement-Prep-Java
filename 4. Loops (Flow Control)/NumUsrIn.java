import java.util.*;

public class NumUsrIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();

        int num = 1;

        while (num <= range) {
            System.out.print(num + " ");
            num++;
        }
    }
}
