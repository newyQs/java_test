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
