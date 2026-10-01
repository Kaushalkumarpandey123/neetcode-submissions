class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = heights.length - 1;
        while (left < right) {
            int size = right - left;
            int width = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, size * width);
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
