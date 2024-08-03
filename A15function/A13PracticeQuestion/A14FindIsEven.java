package A15function.A13PracticeQuestion;

public class A14FindIsEven {
    public static boolean isEven(int num) {
        if (num == 0 || num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String arge[]) {
        System.out.println(isEven(101));
    }
}
