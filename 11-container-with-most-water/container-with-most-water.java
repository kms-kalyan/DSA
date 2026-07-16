class Solution {
    public int maxArea(int[] h) {
        
        int n = h.length,left = 0,right = n-1,area=0;
        while(left<right){
            area = Math.max(area,Math.min(h[right],h[left])*(right-left));
            if(h[left]<=h[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}