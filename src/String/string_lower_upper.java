package String;

public class string_lower_upper {
    public static void main(String[] args) {
        String str = "aAd 32llDL";
        // 使用大小写转换时，数字或非字符不收影响
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
