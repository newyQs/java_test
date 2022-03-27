package array;

public class array3 {
    public static void main(String[] args) {
        // 1. 先声明，再用new运算符进行内存分配
        int a[][];
        // 1.1 直接为每一维分配内存空间
        a = new int[2][4];
        // 1.2 分别为每一维分配内存
        int b[][];
        b = new int[2][];
        b[0] = new int[2];
        b[1] = new int[3];

        // 2. 声明的同时为数组分配内存
        int c[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    }
}
