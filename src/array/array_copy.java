package array;

import java.util.Arrays;

public class array_copy {
    public static void main(String[] args) {
        int arr[] = new int[]{23, 234, 53};
        // 复制已有的数组，newLength代表新数组的长度，
        // 长度大于原有数组，整型数组用0填充，char型数组用null填充
        // 长度不足，则会从数组arr的第一个元素截取至满足新数组长度的元素
        int new_arr[] = Arrays.copyOf(arr, 5);
        for (int i = 0; i < new_arr.length; i++) {
            System.out.println(new_arr[i]);
        }
    }
}
