class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int l = i + 1;
            int r = n - 1;

            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];
                if(sum < 0){
                    l++;
                }else if(sum > 0){
                    r--;
                }else{
                    List<Integer> temp = Arrays.asList(arr[i], arr[l], arr[r]);
                    ans.add(temp);
                    l++;
                    r--;
                    while(l < r && arr[l] == arr[l-1]) l++;
                    while(l < r && arr[r] == arr[r+1]) r--;
                }
            }
        }
        return ans;

        

    }
}