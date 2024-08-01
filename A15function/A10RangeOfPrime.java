package A15function;

public class A10RangeOfPrime {
    // helper func
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // solution func
    public static void rangeOfPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // main func
    public static void main(String args[]) {
        int n = 5;
        System.out.println(isPrime(n));
        rangeOfPrime(n);
    }
}
