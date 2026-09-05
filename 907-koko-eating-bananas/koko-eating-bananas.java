class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        int res=0;

        for(int i : piles){
            //low = Math.min(low,i);
            high = Math.max(high,i);
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            int cnt = isPossible(piles,mid);
            if(cnt>h){
                low = mid+1;
            }else{
                high = mid-1;
                res = (int) mid;
                //return mid;
            }
        }

        return res;
    }

    public static int  isPossible(int piles[],int mid){
        int count = 0;
        for (int i = 0;i< piles.length; i++){
              count+=Math.ceil((double) piles[i]/mid);
        }
        return count;
    }
}