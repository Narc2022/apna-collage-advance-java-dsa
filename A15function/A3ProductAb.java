package A15function;

import java.util.Scanner;

public class A3ProductAb {
    public static int Product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = Product(a, b);
        System.out.println(product);
    }
}
