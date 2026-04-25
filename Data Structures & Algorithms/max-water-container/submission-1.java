class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int max = 0, bar;
        while(i < j){
            if(heights[i] >= heights[j])
                bar = heights[j];
            else
                bar = heights[i];

            if(bar * (j-i) > max)
                max = bar * (j - i);
            
            if(i == j - 1){
                i = 0;
                j--;
            }
            else
                i++;
        }
        return max;
    }
}
