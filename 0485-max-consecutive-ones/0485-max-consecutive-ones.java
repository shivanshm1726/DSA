class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int x : nums){
            if(x == 1){
                count++;
                if(ans<count){
                    ans = count;
                }
            }else{
                count=0;
            }
        }
        return ans;
    }
}