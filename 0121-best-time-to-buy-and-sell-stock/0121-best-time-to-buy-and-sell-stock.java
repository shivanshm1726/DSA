class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit = 0;
        int buyPrice = arr[0];
        for(int i = 1; i<arr.length; i++){
            int currProfit = arr[i] - buyPrice;
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
            if(arr[i] < buyPrice){
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
}