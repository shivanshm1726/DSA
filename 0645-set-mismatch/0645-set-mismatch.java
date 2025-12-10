class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq = new int[nums.length + 1];
        int dup = -1, miss = -1;

        for(int x : nums){
            freq[x]++;
        }

        for(int i = 1; i<=nums.length; i++){
            if(freq[i] == 2) dup = i;
            if(freq[i] == 0) miss = i;
        }

        return new int[]{dup, miss};
    }
}