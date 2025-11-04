class Solution {
    public void moveZeroes(int[] arr) {
        int left = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }
}