public class RemoveElement {
    public static void main(String[] args) {
        // int[] nums = { 3, 2, 2, 3 }; // 3 2 2 3 => _ 2 2 3 = > 2 2 3 _
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
            PrintArray.print(nums);
        }
        return index;
    }
}