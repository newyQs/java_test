package java_base;

public class escape {
    public static void main(String[] args) {
        char c1 = '\\';
        char c2 = '\123';
        char c3 = '\u0502';
        char c4 = '\'';
        char c5 = '\t';
        char c6 = '\r';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
