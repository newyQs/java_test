# 第3章 Java语言基础
## 3.1 Java主类结构
基本组成单元是类，类体重又包括属性和方法。

每一个应用都必须包含一个main()方法，含有main()方法的类称为主类。

```java
package Number;

public class First{
    static String s1="你好"; // 属性
    public static void main(String[] args){ // 方法
      String s2="java";
      System.out.println(s1);
      System.out.println(s2);
    }
}
```
文件名必须和类名First同名，即First.java。

java是区分大小写的。

### 3.1.1 包声明
一个Java应用是由若干个类组成的。上述类名为First，语句package Number为声明该类所在的包

### 3.1.2 声明成员变量和局部变量
通常将类的属性称为类的全局变量(成员变量)，将方法中的属性称为局部变量。

全局变量声明在类体中，局部变量声明在方法体中。

全局变量和局部变量都有其作用的范围。

### 3.1.3 编写主方法
main()方法是类体中的主方法。

public、static和void分别是main()方法的权限修饰符、静态修饰符和返回值修饰符。

java的main()方法必须声明public static void。

String[] args 是一个字符串类型的数组，它是main()方法的参数。

### 3.1.4 导入API类库
在java中，可以通过import导入相关的类。

在JDK的API中，有很多包。

## 3.2 基本数据类型
java中有8种基本数据类型来存储数值、字符和布尔值。

数值型：
    整数类型：byte short int long
    浮点类型：float double
字符型：
    char
布尔型：
    boolean
    
### 3.2.1 整数类型
       内存空间    取值范围
byte    8位      -128 ~ 127                                      -(2**7) ~ (2**7)-1
short   16位     -32768 ~ 32767                                  -(2**15) ~ (2**15)-1
int     32位     -2147483648 ~ 2147483647                        -(2**31) ~ (2**31)-1
long    64位     -9223372036854775808 ~ 9223372036854775807      -(2**63) ~ (2**63)-1

在定义4种类型的变量时，需要注意变量的取值范围，超出范围就会出错。

对于long类型的值，如果赋给的值大于int型的最大值或小于int型的最小值，则需要在数字后加L或l，表明该数值为长整数。如long num=2147483650L

```java
package Number;

public class First{
    
    public static void main(String[] args) {
        byte mybyte = 123;
        short myshort = 3999;
        int myint = 8439893;
        long mylong = 89430030;

        long result = mybyte + myshort + myint + mylong;
        System.out.println("结果为：" + result);
    }
}
```

### 3.2.2 浮点类型
       内存大小     取值范围
float   32位     1.4E-45~3.4028235E38
double  64位     4.9E-324~1.7976931348623157E308

默认情况下，小数都被看做double类型，若使用float型小数，则需要在小数后面必须添加F或f。

```java
package java_base;

public class floating {
    public static void main(String[] args) {
        float f1 = 12.34f;
        double d1 = 19839.12d;
        double d2 = 3729.322;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(d2);
    }
}
```

### 3.2.3 字符类型
字符类型(char)用于存储单个字符，占用16位(2个字节)内存空间。在定义时必须使用单引号。

```java
package java_base;

public class string {
    public static void main(String[] args) {
        char word1 = 'd', word2 = '@';
        int p1 = 2383, p2 = 8493;
        System.out.println("d在unicode表中的顺序位置是：" + (int) word1);
        System.out.println("@在unicode表中的顺序位置是：" + (int) word2);
        System.out.println("unicode表中的2383顺序位置是：" + (char) p1);
        System.out.println("unicode表中的8493顺序位置是：" + (char) p2);
    }
}
```
转义字符：
```text
\ddd    1~3位八进制数据所代表的字符，如\123
\uxxx   4位十六进制数据所代表的字符，如\u0052
\'      
\\
\t
\n
\r
\b
\f
```
```java
package java_base;

public class escape {
    public static void main(String[] args) {
        char c1 = '\\';
        char c2 = '\123';
        char c3 = '\u0502';
        char c4 = '\'';
        char c5 = '\t';
        char c6 = '\r';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
```

### 3.2.4 布尔类型
布尔类型只有true和false两个值。

布尔类型不能与整数类型进行转换，只能被用于流程语句中作为判断条件。

```java
package java_base;

public class bool {
    public static void main(String[] args) {
        boolean b1, b2;
        b1 = false;
        boolean b = true;
        System.out.println(b);
        System.out.println(b1);
    }
}
```

## 3.3 变量和常量
在程序执行过程中，其值不能被改变的称为常量，其值能被改变称为变量。

### 3.3.1 标识符和关键字

1. 标识符

2. 关键字


### 3.3.2 声明变量


### 3.3.3 声明常量
常量在整个程序中只能被赋值一次。

声明一个常量，除了指定数据类型外，需要使用关键字final限定。

```java
package java_base;

public class statement_constant {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        final boolean BOOL = true;
    }
}
```
当定义的 final 变量属于成员变量时，必须在定义时就设定它的值，否则出现编译错误。
```java
package java_base;

public class statement_constant2 {
    static final double PI = 3.14; //此时不进行赋值会报错
    static int age = 23; //声明int型变量age，并赋值

    public static void main(String[] args) {
        final int number; //声明int型常量number
        number = 1235; // 对常量赋值
        age = 22; // 再次对变量赋值
        // number=233; 错误的代码，因为常量只能被赋值一次
        System.out.println("常量PI的值为:" + PI);
        System.out.println("赋值后number的值为：" + number);
        System.out.println("int型变量gae的值为：" + age);
    }
}
```

### 3.3.4 变量的有效范围
变量被定义出来后只能暂存在内存中，等到程序执行到某一个点，该变量就会被释放掉，也就是说变量有它的生命周期。

1. 成员变量
在类体中所定义的变量称为成员变量，成员变量在整个类中都是有效的。

类的成员变量又分为 静态变量 和 实例变量
```java
package java_base;

public class variable {
    int x = 45;
    static int y = 90;
}

```
如果在成员变量的类型前面加上关键字static，这样的成员变量被称为静态变量。

静态变量的有效范围可以跨类，甚至可达到整个应用程序之内。

2. 局部变量
在类的方法体中定义的变量(在方法内部定义)称为局部变量。局部变量只在当前代码块有效。

## 3.4 运算符

### 3.4.1 赋值运算符

```java
package java_base;

public class Valuation {
    public static void main(String[] args) {
        int a, b, c;
        a = 15;
        c = b = a + 5;
        System.out.println("c的值：" + c);
        System.out.println("b的值：" + b);
    }
}
```
赋值运算符会优先从最右边进行处理。

### 3.4.2 算术运算符
+ - * / %
