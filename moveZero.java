package leetcode;

public class moveZero {
    class Solution {
    public void moveZeroes(int[] nums) {
        int n = 0;
        
        for (int i : nums) {
            if (i != 0) {
                nums[n++] = i;
            }
        }
        while (n < nums.length) {
            nums[n++] = 0;
        }
    }
}
}
