package String;

public class string1 {
    public static void main(String[] args) {
        char a[] = {'g', 'o', 'o', 'd'};
        String s1 = new String(a); //等价于String s1 = new String("good")

        char b[] = {'s', 't', 'u', 'd', 'e', 'n', 't'};
        String s2 = new String(b, 2, 4); //等价于String s2 = new String("uden")

        char c[] = {'s', 't', 'u', 'd', 'e', 'n', 't'};
        String s3 = new String(c); //等价于String s3 = new String("student")
    }
}
