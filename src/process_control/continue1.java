package process_control;

public class continue1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;//如果是偶数就跳过输出
            }
            System.out.println(i);
        }
    }
}
