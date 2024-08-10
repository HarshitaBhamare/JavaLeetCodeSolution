public class RemoveDuplicates {
    public static void main(String[] args) {
        // int[] nums = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5 };
        int[] nums = {};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0, i = 0;
        while (i < nums.length) {
            if (nums[index] == nums[i]) {
                while ((i < nums.length) && nums[i] == nums[index]) {
                    i++;
                }
            } else {
                nums[++index] = nums[i];
                while ((i < nums.length) && nums[i] == nums[index]) {
                    i++;
                }

            }
        }
        PrintArray.print(nums);
        index++;
        return index;
    }
}
