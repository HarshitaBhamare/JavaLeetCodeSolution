public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        // L L R
        // -8 -1 0 1 4
        // 0 1 1 16 64 a[i] = nums[left++] nums[right--]
        int[] a = new int[nums.length];
        int l = 0, r = nums.length - 1;
        int index = nums.length - 1;
        while (l <= r || index >= 0) {
            int left = nums[l] * nums[l];
            int right = nums[r] * nums[r];
            if (left > right) {
                a[index] = left;
                l++;
            } else {
                a[index] = right;
                r--;
            }
            index--;
        }
        return a;
    }
}
