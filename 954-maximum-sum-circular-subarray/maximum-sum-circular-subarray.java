class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmax = 0;
        int maxsum = Integer.MIN_VALUE;
        int currentmin = 0;
        int minsum = Integer.MAX_VALUE;
        int totalsum = 0;
        for (int num:nums){
            currentmax = Math.max(num,currentmax+num);
            maxsum = Math.max(currentmax,maxsum);
            currentmin = Math.min(num,currentmin+num);
            minsum = Math.min(currentmin,minsum);
            totalsum += num;

        }
        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum - minsum );
        
    }
}