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
