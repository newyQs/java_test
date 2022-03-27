# 第5章 字符串

## 5.1 字符类

### 5.1.1 声明字符串
在java中，单个字符用单引号('')包围，多个字符即字符串必须用双引号("")包围。

在java中，字符串被当做对象来管理，因此可以像创建其他类对象一样来创建字符串对象。

### 5.1.2 创建字符串
String类的常用构造方法如下：

(1) String(char a[])

(2) String(char a[], int offsets, int length)

(3) String(char[] value)

```java
package String;

public class string1 {
    public static void main(String[] args) {
        char a[] = {'g', 'o', 'o', 'd'};
        String s1 = new String(a); //等价于String s1 = new String("good")

        char b[] = {'s', 't', 'u', 'd', 'e', 'n', 't'};
        String s2 = new String(b, 2, 4); //等价于String s2 = new String("uden")

        char c[] = {'s', 't', 'u', 'd', 'e', 'n', 't'};
        String s3 = new String(c); //等价于String s3 = new String("student")
    }
}
```

## 5.2 连接字符串

### 5.2.1 连接多个字符串
```java
package String;

public class string2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("world");

        String s = s1 + " " + s2;
        System.out.println(s);
    }
}
```

### 5.2.2 连接其他数据类型
字符串也可以同其他基本数据类型进行连接。如果将字符串同这些数据类型进行连接，会将这些数据类型直接变成字符串。
```java
package String;

public class string3 {
    public static void main(String[] args) {
        int booktime = 4;
        float practice = 2.5f;
        System.out.println("我每天花费" + booktime + "小时看出，" + practice + "小时上机练习；");
    }
}
```
当表示字符串类型的数据和字符串进行连接时，会自动调用toString()方法，将其变成字符串类型，然后再进行连接。

### 5.3 获取字符串信息
如何获取字符串的有效信息，如获取字符串的长度，某个索引位置的字符。

### 5.3.1 获取字符串长度

```java
package String;

public class string_length {
    public static void main(String[] args) {
        String str = "we are students";
        // 获取字符串的长度
        System.out.println(str.length());
    }
}
```

### 5.3.2 字符串查找

```java

public class string_index {
    public static void main(String[] args) {
        String str = "we are students";
        // 获取字符串 str 的长度
        System.out.println(str.length());
        // 获取字符 e 首次出现的位置，若字符不存在，返回-1
        System.out.println(str.indexOf('e'));
        // 获取字符 e 最后一次出现的位置，若字符串不存在，返回-1
        System.out.println(str.lastIndexOf('e'));
        
        // 如果传入的字符 为空，indexOf 返回0，lastIndexOf返回结果与数组长度一致
        System.out.println(str.indexOf("")); //0
        System.out.println(str.lastIndexOf("")); //15
    }
}
```

### 5.3.3 获取指定索引位置的字符串

```java
package String;

public class str_charAt {
    public static void main(String[] args) {
        String str = "we are students";
        // 获取索引5处的字符，如果索引越界则会抛出异常
        System.out.println(str.charAt(5));
    }
}
```

## 5.4 字符串操作

### 5.4.1 获取子字符串

```java
package String;

public class string_substring {
    public static void main(String[] args) {
        String str = "we are students";

        // substring(start, end 字符串截取
        // 注意截取的索引不能越界
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}
```

### 5.4.2去除空格

```java
package String;

public class string_trim {
    public static void main(String[] args) {
        String str = "  we are students  ";
        System.out.println(str.length());
        // 去除首尾空格前
        System.out.println(str);
        // 去除首尾空格后
        String t = str.trim();
        System.out.println(t);
        System.out.println(t.length());
        // 注意trim并不改变原字符串对象，该方法返回一个去除首尾空格后的字符串
    }
}
```

### 5.4.3字符串替换

```java
package String;

public class string_replace {
    public static void main(String[] args) {
        String str = "we are students";
        // replace(oldstr, newstr)
        // 如果oldstr出现多次，则会都替换掉
        String s = str.replace("students", "family");
        System.out.println(str);
        System.out.println(s);
    }
}
```

### 5.4.4判断字符串的开始和结尾

```java
package String;

public class string_start_end {
    public static void main(String[] args) {
        String str = "we are students";

        System.out.println(str.startsWith("we"));
        System.out.println(str.startsWith("wea"));

        System.out.println(str.endsWith("ts"));
        System.out.println(str.endsWith("ets"));
    }
}
```

### 5.4.5判断字符串是否相等

```java
package String;

public class string_equal {
    public static void main(String[] args) {
        String tom = new String("I am a student");
        String jerry = new String("I am a student");
        // 直接使用运算符进行判断
        boolean b = (tom == jerry);
        // false。虽然字符串一样，但是字符串是对象，tome，jerry都是引用
        System.out.println(b);
        // 因此比较两个字符串是否相等，需要用到字符串的equals()方法和equalsIgnoreCase()方法
        // 1. equals() 如果两个字符串具有相等的长度和相同的字符，区分大小写
        System.out.println(tom.equals(jerry));
        // 2. equalsIgnoreCase() 是不区分大小写
        System.out.println(tom.equalsIgnoreCase(jerry));
    }
}
```

### 5.4.6按字典顺序比较字符串

compareTo()方法是按字典顺序比较两个字符串，该比较基于字符串各个字符的unicode值，
```java
package String;

public class str_compare {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "acd";

        System.out.println(s1.compareTo(s2));

    }
}
```

### 5.4.7字母大小写转换

```java
package String;

public class string_lower_upper {
    public static void main(String[] args) {
        String str = "aAd 32llDL";
        // 使用大小写转换时，数字或非字符不收影响
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
```

### 5.4.8字符串分割

```java
package String;

public class string_split {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        String[] firstArray = str.split("\\.");
        String[] secondArray = str.split("\\.", 2);

        // 分割后的结果存放在字符串数组中
        System.out.println(firstArray);
        for (String a : firstArray) {
            System.out.println(a);
        }

        System.out.println(secondArray);
        for (String b : secondArray) {
            System.out.println(b);
        }
    }
}
```

## 5.5 格式化字符串
String类的静态format()方法用于创建格式化的字符串。

(1) format(String format,Object...args)

(2) format(Local l, String format, Object...args)

### 5.5.1 日期和时间字符串格式化

(1) 日期格式化
```java
package String;

import java.util.Date;

public class format_date {
    public static void main(String[] args) {
        Date date = new Date();
        // te 一个月中的某一天(1~31)
        String te = String.format("%te", date);
        System.out.println(te);
        // tb 指定语言环境的月份简称
        String tb= String.format("%tb", date);
        System.out.println(tb);
        // tB 指定语言环境的月份全称
        String tB= String.format("%tB", date);
        System.out.println(tB);
        // ta 指定语言环境的星期几简称
        String ta= String.format("%ta", date);
        System.out.println(ta);
        // tA 指定语言环境的星期几全称
        String tA= String.format("%tA", date);
        System.out.println(tA);
        // tc 包括全部日期和时间信息
        String tc= String.format("%tc", date);
        System.out.println(tc);
        // ty 2位年份
        String ty= String.format("%ty", date);
        System.out.println(ty);
        // tY 4位年份
        String tY= String.format("%tY", date);
        System.out.println(tY);
        // tj 一年中的第几天(001 ~ 366)
        String tj= String.format("%tj", date);
        System.out.println(tj);
        // tm 月份
        String tm= String.format("%tm", date);
        System.out.println(tm);
        // td 一个月中的第一天(01~31)
        String td= String.format("%td", date);
        System.out.println(td);
    }
}
```

(2) 时间格式化
```java
package String;

import java.util.Date;

public class format_time {
    public static void main(String[] args) {
        Date date = new Date();
        // tH 2位数字的24时制的小时(00~23)
        String tH = String.format("%tH", date);
        System.out.println(tH);
        // tI 2位数字的12时制的小时(01~12)
        String tI = String.format("%tI", date);
        System.out.println(tI);
        // tk 2位数字的24时制的小时(0~23)
        String tk = String.format("%tk", date);
        System.out.println(tk);
        // tl 2位数字的12时制的小时(1~12)
        String tl = String.format("%tl", date);
        System.out.println(tl);
        // tM 2位数字的分钟(00~59)
        String tM = String.format("%tM", date);
        System.out.println(tM);
        // tS 2位数字的秒数(00~60)
        String tS = String.format("%tS", date);
        System.out.println(tS);
        // tL 3位数字的毫秒数(000~999)
        String tL = String.format("%tL", date);
        System.out.println(tL);
        // tN 9位数字的微秒数(000000000~999999999)
        String tN = String.format("%tN", date);
        System.out.println(tN);
        // tp 指定语言上午或下午标记
        String tp = String.format("%tp", date);
        System.out.println(tp);
        // tz 相对于 GMT RFC 82格式的数字时区偏移量
        String tz = String.format("%tz", date);
        System.out.println(tz);
        // tZ 时区缩写形式的字符串
        String tZ = String.format("%tZ", date);
        System.out.println(tZ);
        // ts 1970-01-01 00:00:00 至现在经过的秒数
        String ts = String.format("%ts", date);
        System.out.println(ts);
        // tQ 1970-01-01 00:00:00 至现在经过的毫秒数
        String tQ = String.format("%tQ", date);
        System.out.println(tQ);
    }
}
```

(3) 格式化常见的日期和时间组合
```java
package String;

import java.util.Date;

public class format_date_time {
    public static void main(String[] args) {
        Date date = new Date();
        // tF “年-月-日” 格式(4位年份)
        String tF = String.format("%tF", date);
        System.out.println(tF);
        // tD “月/日/年” 格式(2位年份)
        String tD = String.format("%tD", date);
        System.out.println(tD);
        // tc 全部日期和时间信息
        String tc = String.format("%tc", date);
        System.out.println(tc);
        // tr “时：分：秒” PM(AM) 格式(12时制)
        String tr = String.format("%tr", date);
        System.out.println(tr);
        // tT “时：分：秒” 格式(24时制)
        String tT = String.format("%tT", date);
        System.out.println(tT);
        // tT “时：分” 格式(24时制)
        String tR = String.format("%tR", date);
        System.out.println(tR);
    }
}
```

### 5.5.2 常规类型格式化

```java
package String;

import java.util.Date;

public class format_regular {
    public static void main(String[] args) {
        // %b %B        结果被格式化称布尔类型
        // %h %H                    散列码
        // %s %S                    字符串
        // %c %C                    字符
        // %d                       十进制
        // %o                       八进制
        // %x %X                    十六进制
        // %e                       科学计数法表示的十进制
        // %a                       带有效数和指数十六进制浮点值
        // %n                       行分隔符
        // %%                       字面值%
        String str = String.format("%d", 400 / 2);
        System.out.println(str);
    }
}
```

## 5.6 使用正则表达式

```java
package String;

public class re {
    public static void main(String[] args) {
        /**
         * 元字符：
         * .
         * \d
         * \D
         * \s
         * \S
         * \w
         * \W
         * \p{Lower}
         * \p{Upper}
         * \p{ASCII}
         * \p{Alpha}
         * \p{Digit}
         * \p{Alnum}
         * \p{Punct}
         * \p{Graph}
         * \p{Print}
         * \p{Blank}
         * \p{Cntrl}
         *
         * 限定修饰符：
         * ?
         * *
         * +
         * {n}
         * {n,}
         * {m,n}
         * */
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String s1 = "aaa@";
        String s2 = "aaaaa";
        String s3 = "1233@qq.com";
        if (s1.matches(regex)) {
            System.out.println("s1--true");
        }
        if (s2.matches(regex)) {
            System.out.println("s2--true");
        }
        if (s3.matches(regex)) {
            System.out.println("s3--true");
        }
    }
}
```

## 5.7 字符串生成器
创建成功的字符串对象，其长度是固定的，内容不能被改变和编译。虽然使用+号可以达到附加新字符或字符串的目的，但+号会产生一个新的String实例，
会在内存中创建新的字符串对象。如果重复的对字符串进行修改，将极大的增加系统开销。

验证字符串操作和字符串生成器操作的效率：
```java
package String;

public class string_iter {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 9; i < 1000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String消耗时间：" + (endTime - startTime));

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int j = 0; j < 1000; j++) {
            builder.append(j);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder消耗时间：" + (endTime - startTime));
    }
}
```
新创建的StringBuilder对象初始容量是16个字符，可以自行指定初始长度。如果附加的字符超过可容纳的长度，则StringBuilder对象将自动增加长度以容纳被附加的字符。
若要使用StringBuilder最后输出字符串结果，可以使用toString()方法。利用StringBuilder类中的方法可动态的执行添加、删除和插入等字符串的编辑操作。

(1) append(value)

(2) insert(start, end)

(3) delete(index, value)

```java
package String;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("123");

        s.append("456");
        System.out.println(s);

        s.delete(1, 3);
        System.out.println(s);

        s.insert(2, "abc");
        System.out.println(s);
    }
}
```