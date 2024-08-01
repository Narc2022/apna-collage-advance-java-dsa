package A15function;

// prime number is number which will divisible by itself or only one.
public class A8PrimeOrNot {
    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= (num - 1); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int num = 6;
        System.out.println(isPrime(num));
    }
}
