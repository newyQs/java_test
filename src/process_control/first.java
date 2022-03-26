package process_control;

public class first {
    public static void main(String[] args) {
        int x = 20;
        {
            int y = 40; // 块区域的y变量
            System.out.println(y);
            int z = 399; // 块区域的y变量
            boolean b;
            {
                int a = 2;
                b = y > z; // 块区域的b变量
                System.out.println(b);
            }
            // System.out.println(a); //这里无法使用a，因为变量a在块区域里面
        }
        String world = "hello java";
        System.out.println(world);
        // System.out.println(y); //这里无法使用y，因为变量y在块区域里面
    }
}