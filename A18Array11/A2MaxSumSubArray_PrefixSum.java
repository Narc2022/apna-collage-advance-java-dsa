package A18Array11;

public class A2MaxSumSubArray_PrefixSum {
    public static int SubOfSubArray(int arr[]) {
        int maxSum = 0;
        int currSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                // System.out.println("i=" + i + " " + "j=" + j + " " + currSum);
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8, 9 };
        System.out.println("maxmum sum : " + SubOfSubArray(arr));
    }
}
