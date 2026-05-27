class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int c = 1;

        while (c <= k) {

            int temp = nums[n - 1];

            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = temp;

            c++;
        }
    }
}