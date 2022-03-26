package String;

public class string_split {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        String[] firstArray = str.split("\\.");
        String[] secondArray = str.split("\\.", 2);

        // 分割后的结果存放在字符串数组中
        System.out.println(firstArray);
        for (String a : firstArray) {
            System.out.println(a);
        }

        System.out.println(secondArray);
        for (String b : secondArray) {
            System.out.println(b);
        }
    }
}
