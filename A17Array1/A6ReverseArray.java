package A17Array1;

public class A6ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] revArray = reverseArray(arr);
        for (int i = 0; i < revArray.length; i++) {
            System.out.print(revArray[i] + " ");
        }
    }

}
