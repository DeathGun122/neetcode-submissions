class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for(int i = 0; i < output.length; i++){
            output[i] = 1;
            for(int j = 0; j < i; j++)
                output[i] *= nums[j];
            
            for(int k = i + 1; k < output.length; k++)
                output[i] *= nums[k];
        }
        return output;
    }
}  
