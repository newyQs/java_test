package array;

import java.util.Arrays;

public class array10 {
    public static void main(String[] args) {
        int arr[] = new int[]{23, 42, 12, 8};
        // 对数组进行排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
