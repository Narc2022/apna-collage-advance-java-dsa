package A15function.A13PracticeQuestion;

public class A17DecToBin {
    public static int DecToBin(int decNum) {
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int) Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        return binNum;
    }

    public static void main(String args[]) {
        System.out.println(DecToBin(27));
    }
}
