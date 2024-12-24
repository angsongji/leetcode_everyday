class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        int i = 0;
        for (int[] arr : grid) {

            for (int k : arr) {
                int current = String.valueOf(k).length();
                if (ans[i] < current)
                    ans[i] = current;
                i++;
            }
            i = 0;
        }
        return ans;
    }
}