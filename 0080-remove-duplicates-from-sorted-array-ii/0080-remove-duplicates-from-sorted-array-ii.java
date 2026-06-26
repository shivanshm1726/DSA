class Solution {
    public int removeDuplicates(int[] arr) {
        int officer = 1;
        int cmo = 2;
        
        while(cmo < arr.length){
            if(arr[cmo] != arr[officer - 1]){
                officer++;
                arr[officer] = arr[cmo];
            }
            cmo++;
        }

        return officer + 1;
    }
}