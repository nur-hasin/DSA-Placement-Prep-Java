public class TypePromotion {
    public static void main(String args[]) {
        short a = 5;
        byte b = 25;
        char c = 'a';
        int d = (a + b + c);
        System.out.println(d);

        int e = 10;
        float f = 20.25f;
        long g = 500;
        double h = 30.90009;
        double i = (e + f + g + h);
        System.out.println(i);

        byte j = 5;
        int k = j*2;
        System.out.println(k);
    } 
}