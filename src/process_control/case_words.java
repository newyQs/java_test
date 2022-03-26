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
