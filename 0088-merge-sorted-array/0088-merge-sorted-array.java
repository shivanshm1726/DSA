class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;

        while(b >= 0){
            if(a >= 0 && arr1[a] > arr2[b]){
                arr1[c] = arr1[a];
                a--;
            }else{
                arr1[c] = arr2[b];
                b--;
            }
            c--;
        }
    }
}