class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length+1];
        List<Integer> missing = new ArrayList<>();

        for(int x: nums){
            freq[x]++;
        }

        for(int i = 1; i<=nums.length; i++){
            if(freq[i] == 0){
                missing.add(i);
            }
        }

        return missing;
    }
}