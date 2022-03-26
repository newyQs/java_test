package java_base;

public class number {
    public static void main(String[] args) {
        byte mybyte = 124;
        int myint = 149;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.45456;

        System.out.println("byte类型和float型数据进行运算：" + (mybyte + myfloat));
        System.out.println("byte类型和int型数据进行运算：" + (mybyte + myint));
        System.out.println("byte类型和char型数据进行运算：" + (mybyte + mychar));
        System.out.println("byte类型和double型数据进行运算：" + (mybyte + mydouble));
    }
}
