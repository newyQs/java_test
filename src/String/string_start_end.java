package String;

public class string_start_end {
    public static void main(String[] args) {
        String str = "we are students";

        System.out.println(str.startsWith("we"));
        System.out.println(str.startsWith("wea"));

        System.out.println(str.endsWith("ts"));
        System.out.println(str.endsWith("ets"));
    }
}
