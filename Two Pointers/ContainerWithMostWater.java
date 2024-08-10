public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int resultantArea = 0;
        while (l <= r) {
            resultantArea = Math.max(resultantArea, Math.min(height[l], height[r]) * (r - l));
            // System.out.println(resultantArea);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return resultantArea;
    }
}
