package java_base;

public class string {
    public static void main(String[] args) {
        char word1 = 'd', word2 = '@';
        int p1 = 2383, p2 = 8493;
        System.out.println("d在unicode表中的顺序位置是：" + (int) word1);
        System.out.println("@在unicode表中的顺序位置是：" + (int) word2);
        System.out.println("unicode表中的2383顺序位置是：" + (char) p1);
        System.out.println("unicode表中的8493顺序位置是：" + (char) p2);
    }
}
