class Solution {
    public int[] runningSum(int[] nums) {
        int i,j;
        int[] sum = new int[nums.length];

        for(i = 0; i< nums.length; i++){
            for(j = 0; j< i+1; j++){
                sum[i] += nums[j];
            }
        }

        return sum;
    }
}