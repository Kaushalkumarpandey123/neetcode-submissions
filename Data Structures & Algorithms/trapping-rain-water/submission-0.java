class Solution {
    public int trap(int[] height) {
        int amt = 0, l = height.length;

        // calculate prefix maximum
        int pre[] = new int[l];
        pre[0] = height[0];
        for (int i = 1; i < l; i++) {
            pre[i] = Math.max(pre[i - 1], height[i]);
        }

        // calculate sufix maximum
        int suf[] = new int[l];
        suf[l - 1] = height[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            suf[i] = Math.max(suf[i + 1], height[i]);
        }

        // calcualte amount
        for (int i = 0; i < l; i++) {
            amt += (Math.min(pre[i], suf[i]) - height[i]);
        }
        return amt;
    }
}
