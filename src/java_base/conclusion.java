package java_base;

public class conclusion {
    public static void main(String[] args) {
        // 1. 整型
        byte mybyte = 12;
        short myshort = 25532;
        int myint = 894389;
        long mylong = 49839;

        // 2. 浮点型
        float myfloat = 899.23f; // float类型必须在后面加上f或者F
        double mydouble = 90389.489; //double后面可加可不加 d或者D

        // 3. 字符型
        char mychar = 'd';
        char mychar2 = 65535; //char 类型占16位，2个字节，允许使用整数：0~65535

        System.out.println(mychar2);
        System.out.println(Math.pow(2, 16) - 1);
    }
}
