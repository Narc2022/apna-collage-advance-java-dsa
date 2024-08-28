package A18Array11;

public class A1MaxSumSubArray {
    public static int SubOfSubArray(int arr[]) {
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int currentSum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                    currentSum += arr[j2];
                }
                System.out.println(" ");
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println(SubOfSubArray(arr));
    }
}
