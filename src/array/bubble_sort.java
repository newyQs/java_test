package array;

public class bubble_sort {
    public static void main(String[] args) {
        // 初始化数组
        int arr[] = {13, 4, 2, 45, 6, 34, 5, 10};
        System.out.println(arr.length);
        // 从小到大排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr);
        // 输出排序完的数组
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        for (int y : arr) {
            System.out.println(y);
        }
    }

}
