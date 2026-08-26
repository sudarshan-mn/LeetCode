class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxValue=0;

        for(int val:nums){
            maxValue=Math.max(maxValue,val);
        }

        int [] points=new int[maxValue+1];

        for(int num:nums){
            points[num]+=num;
        }

        int n=points.length;
        int [] dp=new int[n];

        dp[0]=points[0];
        dp[1]=Math.max(points[0],points[1]);

        for(int i=2;i<n;i++){
            int take=points[i]+dp[i-2];

            int skip=dp[i-1];

            dp[i]=Math.max(take,skip);
        }

        return dp[n-1];
    }
}