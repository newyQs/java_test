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
