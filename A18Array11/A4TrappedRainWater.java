package A18Array11;

public class A4TrappedRainWater {
    public static int TrappedWater(int height[]) {
        int hl = height.length;
        // calculate left max bondary - array
        int leftMax[] = new int[hl];

        leftMax[0] = height[0];
        for (int i = 1; i < hl; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate right max bondary - array
        int rightMax[] = new int[hl];
        rightMax[hl - 1] = height[hl - 1];
        for (int i = hl - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < hl; i++) {
            int waterLevel = (Math.min(leftMax[i], rightMax[i]) - height[i]);
            trappedWater += waterLevel;
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedWater(height));
    }
}
