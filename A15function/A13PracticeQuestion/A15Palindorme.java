package A15function.A13PracticeQuestion;

public class A15Palindorme {
    public static boolean isPalindrom(int num) {
        int initialNum = num;
        int reverseNum = 0;
        int pow = 0;
        while (num > 0) {
            int lastNum = num % 10;
            reverseNum = reverseNum * 10 + lastNum;
            num = num / 10;
            pow++;
        }
        System.out.println(initialNum);
        System.out.println(reverseNum);
        return (initialNum == reverseNum);
    }

    public static void main(String args[]) {
        System.out.println(isPalindrom(89797));
    }
}
