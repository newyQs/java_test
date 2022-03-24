package java_base;

public class statement_constant2 {
    static final double PI = 3.14; //此时不进行赋值会报错
    static int age = 23; //声明int型变量age，并赋值

    public static void main(String[] args) {
        final int number; //声明int型常量number
        number = 1235; // 对常量赋值
        age = 22; // 再次对变量赋值
        // number=233; 错误的代码，因为常量只能被赋值一次
        System.out.println("常量PI的值为:" + PI);
        System.out.println("赋值后number的值为：" + number);
        System.out.println("int型变量gae的值为：" + age);
    }
}
