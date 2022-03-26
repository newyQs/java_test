package process_control;

public class break3 {
    public static void main(String[] args) {
        Loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                    break Loop; // 跳出循环标志Loop
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
