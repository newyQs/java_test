package array;

public class array7 {
    public static void main(String[] args) {
        // 初始化二维数组
        int arr[][] = {{4, 3}, {1, 2}};
        System.out.println("数组中的元素是：");
        // 遍历数组，这里选择foreach的形式遍历
        int i = 0;
        for (int x[] : arr) {
            i++;
            int j = 0;
            for (int e : x) {
                j++;
                if (i == arr.length && j == x.length) {
                    System.out.print(e);
                } else {
                    System.out.print(e + "、");
                }
            }
        }
    }
}
