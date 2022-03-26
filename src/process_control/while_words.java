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
