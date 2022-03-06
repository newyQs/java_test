package java_base;

public class operator {
    public static void main(String[] args) {
        //1. 赋值运算符
        int a, b, c;
        a = 16;
        c = b = a + 34;
        System.out.println("a的值为：" + a);
        System.out.println("b的值为：" + b);
        System.out.println("c的值为：" + c);

        //2. 算数运算符
        int num1 = 142;
        float num2 = 54.89f;
        System.out.println("和为：" + (num1 + num2));
        System.out.println("差为：" + (num1 - num2));
        System.out.println("积为：" + (num1 * num2));
        System.out.println("商为：" + (num1 / num2));

        //3. 自增自减运算符
        int d = 12;
        System.out.println("自增d++:" + (d++));   //12
        System.out.println("此时d:" + (d));   //13
        System.out.println("自增++d:" + (++d));   //14
        System.out.println("此时d:" + (d));   //14

        //4. 比较运算符
        int n1 = 4, n2 = 5;
        System.out.println("" + (n1 > n2));
        System.out.println("" + (n1 < n2));
        System.out.println("" + (n1 == n2));
        System.out.println("" + (n1 >= n2));
        System.out.println("" + (n1 <= n2));
        System.out.println("" + (n1 != n2));

        //5. 逻辑运算符
        int j = 2, k = 8;
        boolean result1 = ((j > k) && (j != k));
        boolean result2 = ((j > k) || (j != k));
        System.out.println(result1);
        System.out.println(result2);

        //6. 位运算符


        //7. 三元运算符:boolean b=20<45?true:false
        boolean w;
        if (20 < 23) {
            w = true;
        } else {
            w = false;
        }
        System.out.println(w);
    }
}
