package java_base;

public class Operator1 {
    public static void main(String[] args) {
        int a = 12;
        a++;
        System.out.println("a++后的值为:" + a); // 13

        int b = 35;
        System.out.println("b++的值为：" + b++); // 35
        System.out.println("b++的值为：" + b); // 36

        int c = 24;
        ++c;
        System.out.println("--c之后的值：" + c); // 25

        int d = 19;
        System.out.println("--d此时的值：" + ++d); // 20
    }
}
