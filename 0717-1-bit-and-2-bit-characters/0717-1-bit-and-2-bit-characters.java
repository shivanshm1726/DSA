class Solution {
    public boolean isOneBitCharacter(int[] arr) {
        int p = 0;
        while(p<arr.length-1){
            if(arr[p] == 1){
                p+=2;
            }else{
                p+=1;
            }
        }
        return p == arr.length-1;
    }
}