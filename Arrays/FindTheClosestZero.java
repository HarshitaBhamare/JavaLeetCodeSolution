public class FindTheClosestZero {
    public static void main(String[] args) {
        int[] nums = { -1000, -1000 };
        System.out.println(findClosestNumber(nums));
    }

    public static int findClosestNumber(int[] nums) {
        // int[] n = new int[nums.length];
        // int n = 0;
        // int m = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] <= 0) {
        // n = Math.abs(nums[i]);
        // nums[i] = n;
        // }
        // System.out.println(nums[i]);
        // int min = nums[0];
        // System.out.println(min);
        // if (nums[i] < min) {
        // min = nums[i];
        // m = min;
        // System.out.println("m" + min);
        // }
        // }
        // return m;
        // -1000, -1000
        int ans = nums[0]; // -1000
        int diff = Math.abs(nums[0]); // 1000
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < diff) { //
                ans = nums[i];
                diff = Math.abs(nums[i]);
            }
            if (diff == Math.abs(nums[i]) && nums[i] > ans) {
                ans = nums[i];
            }
        }
        return ans;
    }
}
