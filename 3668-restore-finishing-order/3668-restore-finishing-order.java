class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int m = order.length;
        int n = friends.length;
        int[] ans = new int[n];
        int k = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(order[i] == friends[j]){
                    ans[k] = friends[j];
                    k++;
                }
            }
        }
        return ans;
    }
}