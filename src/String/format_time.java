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
