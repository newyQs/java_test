package array;

public class use_array {
    public static void main(String[] args) {
        // 声明一维数组并初始化数据
        int day[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            System.out.println((i + 1) + "月有" + day[i] + "天");
        }

        for (int j : day) {
            System.out.println((j + 1) + "月有" + j + "天");
        }
    }
}
