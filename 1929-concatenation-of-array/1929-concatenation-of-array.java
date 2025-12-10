class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] arr = new int[size];

        for(int i = 0; i<nums.length; i++){
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }

        return arr;
    }
}