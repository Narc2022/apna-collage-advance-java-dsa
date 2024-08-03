package A15function;

public class A11BinaryToDecimal {

    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastNum = binNum % 10;
            decNum = decNum + lastNum * ((int) Math.pow(2, pow));
            binNum = binNum / 10;
            pow++;
        }
        System.out.println(decNum);
    }

    public static void main(String args[]) {
        binToDec(110110101);
    }
}