package java_base;

public class Operator3 {
    public static void main(String[] args) {
        boolean a;
        if (20 < 45) {
            a = true;
        } else {
            a = false;
        }
        System.out.println("a的值为：" + a);

        boolean b = 20 < 45 ? true : false;
        System.out.println("b的值为：" + b);
    }
}
