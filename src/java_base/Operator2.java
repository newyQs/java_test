package java_base;

public class Operator2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        boolean result1 = ((a > b) & (a != b));
        boolean result2 = ((a > b) && (a != b));
        boolean result3 = ((a > b) | (a != b));
        boolean result4 = ((a > b) | (a != b));
        boolean result5 = ((a > b) != (a != b));

        System.out.println("result1：" + result1);
        System.out.println("result1：" + result2);
        System.out.println("result1：" + result3);
        System.out.println("result1：" + result4);
        System.out.println("result1：" + result5);
    }
}
