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
