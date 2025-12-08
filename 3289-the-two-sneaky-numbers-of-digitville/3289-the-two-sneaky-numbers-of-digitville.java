class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[101];  

        for(int x : nums){
            count[x]++;
        }

        int[] ans = new int[2];
        int idx = 0;

        for(int i = 0; i < 101; i++){
            if(count[i] == 2){
                ans[idx++] = i;
            }
        }
        return ans;
    }
}
