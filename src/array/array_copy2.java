package array;

import java.util.Arrays;

public class array_copy2 {
    public static void main(String[] args) {
        int arr[] = new int[]{23, 45, 21, 45, 12};
        int new_arr[] = Arrays.copyOfRange(arr, 0, 3);
        for (int i = 0; i < new_arr.length; i++) {
            System.out.println(new_arr[i]);
        }
    }
}
