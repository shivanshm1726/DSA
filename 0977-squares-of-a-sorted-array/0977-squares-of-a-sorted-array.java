class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int l = 0;
        int r = arr.length - 1;

        for(int i = n-1; i>=0; i--){
            if(Math.abs(arr[l]) < Math.abs(arr[r])){
                result[i] = arr[r] * arr[r];
                r--;
            }else{
                result[i] = arr[l] * arr[l]; 
                l++;
            }
        }
        return result;
    }
}