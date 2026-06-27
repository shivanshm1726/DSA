class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2];

        for(int i = 0; i< n; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int l = i + 1;
            int r = n - 1;

            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];

                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }

                if(sum < target){
                    l++;
                }else if(sum > target){
                    r--;
                }else{
                    return target;
                }
            }
        }
        return closestSum;
    }
}