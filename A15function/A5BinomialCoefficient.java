package A15function;

public class A5BinomialCoefficient {
    public static int factorial(int val) {
        int fact = 1;
        for (int i = 1; i <= val; i++) {
            fact = fact * val;
        }
        return fact;
    }

    public static int binCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int bic = fact_n / (fact_r * fac_nmr);
        return bic;
    }

    public static void main(String args[]) {
        System.out.println(binCoff(5, 2));
    }
}
