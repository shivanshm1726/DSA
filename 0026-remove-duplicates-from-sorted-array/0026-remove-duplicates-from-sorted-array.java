class Solution {
    public int removeDuplicates(int[] arr) {
        int officer = 0;
        int cmo = 1;
        int unique = 1;

        while(cmo < arr.length){
            if(arr[cmo] == arr[officer]){
                cmo++;
            }else if(arr[cmo] != arr[officer]){
                officer++;
                arr[officer] = arr[cmo];
                cmo++;
                unique++;
            }
        }
        return unique;
    }
}