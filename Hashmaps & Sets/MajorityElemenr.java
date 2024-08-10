public class MajorityElemenr {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int result = 0, count = 0, i = 0;

        while (i < nums.length) {
            if (count == 0) {
                result = nums[i];
            }
            if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
            i++;
        }
        return result;
    }
}
