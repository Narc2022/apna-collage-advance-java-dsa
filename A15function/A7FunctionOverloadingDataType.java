package A15function;

public class A7FunctionOverloadingDataType {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(23, 89));
        System.out.println(sum(45.1f, 23.78f));
    }
}
