class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i<n; i++){
            ans[i] = 1; 
        }

        for(int i = 1; i<n; i++){
            if(arr[i-1] < arr[i]){
                ans[i] = ans[i-1] + 1;
            }
        }

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > arr[i+1]){
                ans[i] = Math.max(ans[i], ans[i+1] + 1);
            }
        }

        int sum = 0;
        for(int num : ans){
            sum += num;
        }
        return sum;
    }
}