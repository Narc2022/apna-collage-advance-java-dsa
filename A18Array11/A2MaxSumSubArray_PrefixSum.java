package A18Array11;

public class A2MaxSumSubArray_PrefixSum {
    public static int[] SubOfSubArray(int arr[]) {
        int maxSum = 0;
        int currentSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println(SubOfSubArray(arr));
    }
}
