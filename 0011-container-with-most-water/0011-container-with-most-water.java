class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int ans = 0;

        while(i < j){
            int dist = j - i;
            int minHeight = 0;

            if(arr[i] < arr[j]){
                minHeight = arr[i];
                i++;
            }else{
                minHeight = arr[j];
                j--;
            }

            if((minHeight * dist) > ans){
                ans = minHeight * dist;
            }

        }
        return ans;
    }
}