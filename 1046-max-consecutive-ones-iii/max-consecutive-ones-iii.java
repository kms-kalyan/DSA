class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,zeros=0,max=0;

        while(i<nums.length){
            if(nums[i] == 0)
                zeros++;
            while(j<=i && zeros>k){
                if(nums[j] == 0)
                    zeros--;
                j++;
            }

            max = Math.max(max,i-j+1);
            i++;
        }

        return max;
    }
}