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
