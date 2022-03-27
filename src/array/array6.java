package array;

public class array6 {
    public static void main(String[] args) {
        // 初始化二维数组
        int arr[][] = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        // 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]); // print不换行输出，println换行输出
            }
            System.out.println();
        }
    }
}