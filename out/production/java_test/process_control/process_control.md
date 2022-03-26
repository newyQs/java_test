# 第4章 流程控制

## 4.1 复合语句

在java语言中，复合语句以整个块区为单位，所以又称为块语句。
复合语句以开括号"{"开始，闭括号"}"结束。

```java
package process_control;

public class first {
    public static void main(String[] args) {
        int x = 20;
        {
            int y = 40; // 块区域的y变量
            System.out.println(y);
            int z = 399; // 块区域的y变量
            boolean b;
            {
                int a = 2;
                b = y > z; // 块区域的b变量
                System.out.println(b);
            }
            // System.out.println(a); //这里无法使用a，因为变量a在块区域里面
        }
        String world = "hello java";
        System.out.println(world);
        // System.out.println(y); //这里无法使用y，因为变量y在块区域里面
    }
}
```
如上实例表明，{}区域声明的变量无法在当前变量所在{}区域外使用。x变量可以在整个方法体里面使用，因为x声明在方法体的最外层。

## 4.2 条件语句

### 4.2.1 if条件语句

1. if 语句

2. if...else...语句

3. if ...else if ...else...语句

```java

```
注意：if语句只执行条件为真的那个分支语句，其他的都不支持，并且最多只执行一个分支。

### 4.2.2 case语句

switch(表达式){
    case 常量值1:
        语句块1;
        [break;]
    ...
    case 常量值n:
        语句块n;
        [break;]
    default
        语句块n+1;
        [break;]
}

switch语句中表达式的值必须是**整型、字符型或字符串类型**。常量值1~n必须是**整型、字符型或者字符串类型**。

switch语句的执行逻辑:
switch语句首先计算表达式的值，如果表达式的值和某个case后面的常量值相等，则执行该case语句后的若干条语句直到遇到break语句为止，
如果该case语句中没有break语句，则会继续执行后面case语句中的代码块，直到遇到break语句为止。最后执行default语句。
如果表达式的值没有和任何case语句中的常量值相等，则执行default语句中的代码块。

注意：
同一个switch语句，case的常量值必须互不相同。

```java
package process_control;

public class case_words {
    public static void main(String[] args) {
        int data = 100;
        switch (data) {  // data只能是整型，字符型或者字符串类型
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 100:
                System.out.println(100);
                break; //这里注意加breank和不加break的区别
            case 1001:
                System.out.println(101);
            default:
                System.out.println("end");
        }
    }
}
```

## 4.3 循环语句

### 4.3.1 while循环语句

```java
package process_control;

public class while_words {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            sum += x;
            x++;
        }
        System.out.println(sum);
    }
}
```

### 4.3.2 do...while循环语句

```java
package process_control;

public class do__while_words {
    public static void main(String[] args) {
        int a = 100;
        while (a == 60) {
            System.out.println("ok1");
            a--;
        }

        int b = 100;
        do {
            System.out.println("ok2");
            b--;
        } while (b == 60);
    }
}
```

do...while和while的区别就是do...while在会首先执行do内部的语句块，再去判断while中的条件是够满足，再决定是否继续循环。

### 4.3.3 for循环语句

(1) for 语句
for语句格式：
```text
for(表达式1;表达式2;表达式3){
    语句序列;
}
```

```java
package process_control;

public class for_words {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum的值是：" + sum);
    }
}
```

(2) foreach
foreach语法格式：
```text
for(元素变量x:遍历对象obj){
    引用x的java语句;
}
```

```java
package process_control;

public class foreach_words {
    public static void main(String[] args) {
        int arr[] = {7, 10, 1};
        System.out.println("arr:" + arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
```

## 4.4 循环控制
循环控制包含两个方面的内容：
1. 控制循环变量的变化方式；
2. 控制循环的跳转；break continue

### 4.4.1 break语句
使用break语句可以跳过switch结构，同时也可以跳出当前循环体，从而中断循环。

```java
package process_control;

public class break1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
    }
}
```

```java
package process_control;

public class break2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                    break;
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
```

java中的“标签”功能：
```text
标签名：循环体{
    break 标签名;
}
```
```java
package process_control;

public class break3 {
    public static void main(String[] args) {
        Loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                    break Loop; // 跳出循环标志Loop
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
```

### 4.4.2 continue语句
continue不是立刻跳出该循环，而是跳出本次循环，继续执行下一个循环。

```java
package process_control;

public class continue1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;//如果是偶数就跳过输出
            }
            System.out.println(i);
        }
    }
}
```
