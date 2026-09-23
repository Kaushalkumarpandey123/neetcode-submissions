class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while ( left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    Collections.sort(triplet);
                    result.add(triplet);
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
