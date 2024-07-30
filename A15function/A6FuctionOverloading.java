// Overloading using Parameters

package A15function;

public class A6FuctionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(5, 3));
        System.out.println(sum(4, 3, 1));
    }
}
