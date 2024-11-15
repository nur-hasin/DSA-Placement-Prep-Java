import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        int a = 25;
        long b = a;   
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();  
        System.out.println(num);
        sc.close();

        char ch = 'a';
        int ascii = ch;  
        System.out.println(ascii);
    }
}
