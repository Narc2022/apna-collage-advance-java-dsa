package A16AdvancePatterns;

public class InvertedRotatedHalfPiramid {
    public static void HalfPiramid(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        HalfPiramid(4, 4);
    }
}
