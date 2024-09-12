package A18Array11;

public class A3MaxSubarraySumKadan {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }

            if (cs > ms) {
                ms = cs;
            }
        }
        System.out.println(ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2 };
        kadanes(numbers);
    }
}
