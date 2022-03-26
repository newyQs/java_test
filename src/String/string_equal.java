package String;

public class string_equal {
    public static void main(String[] args) {
        String tom = new String("I am a student");
        String jerry = new String("I am a student");
        // 直接使用运算符进行判断
        boolean b = (tom == jerry);
        // false。虽然字符串一样，但是字符串是对象，tome，jerry都是引用
        System.out.println(b);
        // 因此比较两个字符串是否相等，需要用到字符串的equals()方法和equalsIgnoreCase()方法
        // 1. equals() 如果两个字符串具有相等的长度和相同的字符，区分大小写
        System.out.println(tom.equals(jerry));
        // 2. equalsIgnoreCase() 是不区分大小写
        System.out.println(tom.equalsIgnoreCase(jerry));
    }
}
