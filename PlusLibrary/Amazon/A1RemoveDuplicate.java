package PlusLibrary.Amazon;

// Remove Duplicates from Sorted Array

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

// Return k after placing the final result in the first x slots of nums.

// Input: nums = [0,1,1,1,2,2,3] 
// Output = 4

public class A1RemoveDuplicate {
    public static void main(String args[]) {
        int nums[] = { 0, 1, 1, 1, 2, 2, 3 };
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] < nums[j]) { // i=1 j=2
                int temp = nums[i + 1]; // 1
                System.out.println("temp" + temp);
                nums[i + 1] = nums[j]; // 1
                System.out.println("nums[i + 1]" + nums[i + 1]);
                nums[j] = temp; // 1
                System.out.println("nums[j]" + nums[j]);
                i++; // 1
            }
        }
        System.out.println(i + 1);
    }
}
