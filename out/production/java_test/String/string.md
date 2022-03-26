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

