package array;

import java.util.Arrays;

public class array_query {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 23, 21};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 0, 1, 8);
        System.out.println(index);
    }
}
