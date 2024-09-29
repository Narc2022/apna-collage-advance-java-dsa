package A19Sorting;

public class A2SelectionSort {
    // int arr[] = { 5, 4, 1, 3, 2, 7 };
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallPos] > arr[j]) {
                    smallPos = j;
                }
            }
            int temp = arr[smallPos];
            arr[smallPos] = arr[i];
            arr[i] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2, 7 };
        SelectionSort(arr);
    }
}
