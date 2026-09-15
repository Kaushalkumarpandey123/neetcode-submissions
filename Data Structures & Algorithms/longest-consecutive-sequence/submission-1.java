class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        List<Integer> startPoint = new ArrayList<>();
        for (int n : nums) {
            if (!set.contains(n - 1)) {
                startPoint.add(n);
            }
        }
    
        for (int e : startPoint) {
            int count = 1;
            while(set.contains(++e)) {
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount == Integer.MIN_VALUE ? 0 : maxCount;
    }
}
