package String;

public class string_substring {
    public static void main(String[] args) {
        String str = "we are students";

        // substring(start, end 字符串截取
        // 注意截取的索引不能越界
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}
