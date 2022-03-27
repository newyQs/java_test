package String;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("123");

        s.append("456");
        System.out.println(s);

        s.delete(1, 3);
        System.out.println(s);

        s.insert(2, "abc");
        System.out.println(s);
    }
}
