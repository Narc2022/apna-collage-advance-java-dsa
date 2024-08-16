package A17Array1;

import java.util.Scanner;

public class A2ArrayInputOutputUpdate {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("physics " + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("maths " + marks[2]);
    }
}
