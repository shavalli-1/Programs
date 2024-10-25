package basicPrograms;

public class RotatingArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;  // Step 1
        reverse(nums, 0, nums.length - 1);  // Step 2
        reverse(nums, 0, k - 1);  // Step 3
        reverse(nums, k, nums.length - 1);  // Step 4
    }
    private void reverse(int[] nums, int start, int end) {  // Step 5
        while (start < end) {
            int temp = nums[start];  // Step 5.1
            nums[start] = nums[end];  // Step 5.2
            nums[end] = temp;  // Step 5.3
            start++;  // Step 5.4
            end--;  // Step 5.5
        }
    }


    public static void main(String[] args) {
        RotatingArray ra = new RotatingArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};  // Input array
        int k = 3;  // Steps to rotate
        ra.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
