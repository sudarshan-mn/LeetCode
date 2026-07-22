class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentsum+nums[i]<nums[i]){
                currentsum=nums[i];
            }
             else{
                currentsum=currentsum+nums[i];

             }

             if(currentsum>maxsum){
                maxsum=currentsum;
             }
        }

        return maxsum;
    }
}