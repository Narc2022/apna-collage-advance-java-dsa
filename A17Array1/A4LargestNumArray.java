package A17Array1;

public class A4LargestNumArray {
    public static int getlgNum(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 2, 1 };
        System.out.println(getlgNum(numbers));
    }

}
