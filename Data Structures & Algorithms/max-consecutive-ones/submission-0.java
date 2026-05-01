class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum++;
                if(sum > res)
                    res = sum;
            }
            else
                sum = 0;
        }
        return res;
    }
}