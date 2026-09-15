class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1; int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zero > 0) {
                    prod = 0;
                    break;
                }
                zero++;
            } else {
                prod *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = prod;
                continue;
            } else if (zero > 0) {
                nums[i] = 0;
            } else {
                nums[i] = prod/nums[i];
            }
        }
        return nums;
    }
}  
