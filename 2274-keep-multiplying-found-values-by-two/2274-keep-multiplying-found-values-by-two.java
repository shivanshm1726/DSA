class Solution {
    public int findFinalValue(int[] arr, int original) {
        Arrays.sort(arr);
        int neww = original;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == neww){
                neww = neww * 2;
            }
        }
        return neww;
    }
}