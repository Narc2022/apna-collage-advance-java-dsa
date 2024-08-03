package A15function;

public class A12DecToBinary {
    public static void decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2; //
            System.out.println("rem" + rem);
            binNum = binNum + (rem * (int) Math.pow(10, pow)); //
            System.out.println("math cal " + (int) Math.pow(10, pow));
            System.out.println("binNum " + binNum);
            pow++;
            decNum = decNum / 2;
        }
        // System.out.println(binNum);
    }

    public static void main(String args[]) {
        decToBin(51);
    }

}
