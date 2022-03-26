package String;

public class string_trim {
    public static void main(String[] args) {
        String str = "  we are students  ";
        System.out.println(str.length());
        // 去除首尾空格前
        System.out.println(str);
        // 去除首尾空格后
        String t = str.trim();
        System.out.println(t);
        System.out.println(t.length());
        // 注意trim并不改变原字符串对象，该方法返回一个去除首尾空格后的字符串
    }
}
