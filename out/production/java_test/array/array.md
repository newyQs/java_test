# 第6章 数组

## 6.1 数组概述

数组是具有相同数据类型的一组数据的集合。

在Java中，同样将数组看作一个对象，虽然基本数据类型不是对象，但由基本数据类型组成的数组却是对象。

## 6.2 一维数组的创建和使用
一维数组实质上就是一组相同类型数据的线性集合，当在程序中需要处理一组数据，或者传递一组数据时，可以应用这种类型的数组。

### 6.2.1 创建一维数组

```java
package array;

public class array1 {
    public static void main(String[] args) {
        // 1. 先声明，再用new运算符进行内存分配
        int arr[];
        String str[];
        // 分配内存空间
        arr = new int[5];

        // 2. 声明的同时为数组分配内存
        int month[] = new int[12];
    }
}
```

## 6.2.2 初始化一维数组

```java
package array;

public class array2 {
    public static void main(String[] args) {
        // 形式一 new int
        int arr[] = new int[]{1, 2, 3, 4, 5};
        // 形式二 
        int arr2[] = {3, 4, 5, 2, 5, 7, 3};
    }
}

```

### 6.2.3 使用一维数组

```java
package array;

public class use_array {
    public static void main(String[] args) {
        // 声明一维数组并初始化数据
        int day[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            System.out.println((i + 1) + "月有" + day[i] + "天");
        }
        // foreach形式
        for (int j : day) {
            System.out.println((j + 1) + "月有" + j + "天");
        }
    }
}
```

## 6.3 二维数组的创建和使用
如果一维数组中的各个元素仍然是一个数组，那么它就是一个二维数组。

### 6.3.1 创建二维数组

```java
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
```

## 6.3.2 初始化二维数组

```java
package array;

public class array4 {
    public static void main(String[] args) {
        int arr[][] = {{12, 4}, {45, 10}};
        System.out.println(arr);
    }
}
```

### 6.3.3 使用二维数组

```java
package array;

public class array5 {
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 6.4 数组的基本操作

### 6.4.1 遍历数组
遍历数组就是获取数组中的每个元素。

```java
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
```

```java
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
```

### 6.4.2 填充替换数组元素
(1) fill(int a[], int value)
该方法是将指定的int值分配给int型数组的每个元素。
```java
package array;

import java.util.Arrays;

public class array8 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // 填充元素8
        Arrays.fill(arr, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i + "个元素是：" + arr[i]);
        }
    }
}
```

(2) fill(int[] a, int fromIndex, int toIndex, int value)
该方法是将指定的int值分配给int型数组指定范围内的每个元素。填充的范围从索引fromIndex到索引toIndex(不包含)。
如果fromIndex=toIndex，则填充范围为空
```java
package array;

import java.util.Arrays;

public class array9 {
    public static void main(String[] args) {
        int arr[] = new int[]{45, 12, 2, 10};
        // 这里就是将索引[1,2]位置的元素，也就是索引1的元素替换成8
        Arrays.fill(arr, 1, 2, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i + "个元素是：" + arr[i]);
        }
    }
}
```

### 6.4.3 对数组进行排序

```java
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
```

### 6.4.4 复制数组
(1) copyOf()

```java
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
```

(2) copyOfRange()
```java
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
```

### 6.4.5 数组查询

```java

```

## 6.5 数组排序算法

```java
package array;

public class bubble_sort  {
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

```

### 6.5.1 冒泡排序

```java

```

### 6.5.2 直接选择排序

直接选择排序的基本思想就是将指定排序位置与其他数组元素分别对比，如果满足条件就交换元素值。

```java
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
```

### 6.5.3 反转排序
顾名思义，反转排序就是以相反的顺序把原有数组的内容重新排序。

基本思想：把数组最后一个元素和第一个元素替换，倒数第二个元素与第二个元素替换，以此类推，直到把所有数组元素反转完毕。

```java
package array;

public class ReverseSort {
    public static void main(String[] args) {
        // 创建一个数组
        int[] array = new int[]{10, 20, 30, 40, 50, 60};
        // 创建反转排序类的对象
        ReverseSort sorter = new ReverseSort();
        // 调用排序对象的方法将数组反转
        sorter.sort(array);
    }

    public void sort(int[] array) {
        System.out.println("数组原有内容：");
        showArray(array);
        int temp;
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            // 交换顺序
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        System.out.println("数组反转后的内容：");
        showArray(array);
    }

    public void showArray(int[] array) {
        for (int i : array) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }
}
```