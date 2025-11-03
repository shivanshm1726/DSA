class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        
        rotate(nums, 0, nums.length - 1);
        rotate (nums, 0, k-1);
        rotate(nums, k, nums.length - 1);
    }

    public void rotate(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}