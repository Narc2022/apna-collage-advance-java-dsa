package A15function;

public class A9OptimizePrimeOrNot {
    public static int math(int num) {
        System.out.println(Math.sqrt(num));
        return num;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int num = 49;
        math(num);
        System.out.println(isPrime(num));
    }
}
