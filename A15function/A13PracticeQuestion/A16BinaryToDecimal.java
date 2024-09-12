package A15function.A13PracticeQuestion;

public class A16BinaryToDecimal {

    public static int BinToDec(int BinNum) {
        int pow = 0;
        int decNum = 0;

        while (BinNum > 0) {
            int lastNum = BinNum % 10;
            decNum = decNum + lastNum * ((int) Math.pow(2, pow));
            pow++;
            BinNum = BinNum / 10;
        }
        return decNum;
    }

    public static void main(String args[]) {
        System.out.println(BinToDec(11011));
    }

}
