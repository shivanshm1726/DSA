class Solution {
    public int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int sum = arr[i] + arr[j];  

            if(sum == target){
                return new int[]{(i+1), (j+1)};
            }else if(sum < target){
                i++;
            }else if(sum > target){
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}