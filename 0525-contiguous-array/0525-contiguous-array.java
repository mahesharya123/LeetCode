class Solution {
    public int findMaxLength(int[] nums) {
     int n = nums.length;
        
        if(n==0||n==1)
        return 0;
        int sum =0;
        int ans = 0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            sum += nums[i]==1?1:-1;
            if(hm.containsKey(sum)){
                int l = hm.get(sum);
                ans = Math.max(ans,i-l);
            }
            else 
             hm.put(sum,i);
        }
        return ans;
    }
}