package String;

public class str_charAt {
    public static void main(String[] args) {
        String str = "we are students";
        // 获取索引5处的字符，如果索引越界则会抛出异常
        System.out.println(str.charAt(5));
    }
}
