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
