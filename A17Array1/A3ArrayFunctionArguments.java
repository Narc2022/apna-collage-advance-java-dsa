package A17Array1;

public class A3ArrayFunctionArguments {

    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 4, 6, 8, 10, 20, 24, 35 };
        int index = linearSearch(nums, 20);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index : " + index);
        }
    }
}