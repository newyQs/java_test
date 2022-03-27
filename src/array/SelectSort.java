package array;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {94, 12, 34, 2, 46, 14};
        SelectSort sorter = new SelectSort();
        sorter.sort(array);
    }

    public void sort(int[] array) {
        int index;
        for (int i = 1; i < array.length; i++) {
            index = 0;
            for (int j = 1; j <= array.length - i; j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            int temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;
        }
        showArray(array);
    }

    public void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
