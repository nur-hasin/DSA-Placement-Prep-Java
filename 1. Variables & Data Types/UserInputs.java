import java.util.*;

public class UserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next(); 
        System.out.println(word);

        sc.nextLine(); // Consume leftover newline characters

        String sentence = sc.nextLine(); 
        System.out.println(sentence);

        int intVal = sc.nextInt(); 
        System.out.println(intVal);

        byte byteVal = sc.nextByte(); 
        System.out.println(byteVal);

        float floatVal = sc.nextFloat(); 
        System.out.println(floatVal);

        double doubleVal = sc.nextDouble(); 
        System.out.println(doubleVal);

        boolean booleanVal = sc.nextBoolean(); 
        System.out.println(booleanVal);

        short shortVal = sc.nextShort(); 
        System.out.println(shortVal);

        long longVal = sc.nextLong(); 
        System.out.println(longVal); 

        sc.close();
    } 
}
