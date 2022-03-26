package String;

public class string_index {
    public static void main(String[] args) {
        String str = "we are students";
        // 获取字符串 str 的长度
        System.out.println(str.length());
        // 获取字符 e 首次出现的位置，若字符不存在，返回-1
        System.out.println(str.indexOf('e'));
        // 获取字符 e 最后一次出现的位置，若字符串不存在，返回-1
        System.out.println(str.lastIndexOf('e'));

        // 如果传入的字符 为空，indexOf 返回0，lastIndexOf返回结果与数组长度一致
        System.out.println(str.indexOf(""));
        System.out.println(str.lastIndexOf(""));
    }
}
