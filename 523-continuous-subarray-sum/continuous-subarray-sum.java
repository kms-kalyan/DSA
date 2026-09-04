class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n<=1)
            return false;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int mod = 0;
        for(int i=0;i<n;i++){
            mod = (mod+nums[i])%k;
            if(map.containsKey(mod)){
                if(i-map.get(mod)>1)
                    return true;
            }else map.put(mod,i);
        }

        return false;
    }
}