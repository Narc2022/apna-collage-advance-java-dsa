package A16AdvancePatterns;

public class InvertedRotatedHalfNumPiramid {
    public static void HalfNumPiramid(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        HalfNumPiramid(4, 4);
    }
}
