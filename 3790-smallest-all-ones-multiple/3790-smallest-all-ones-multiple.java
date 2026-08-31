class Solution {
    public int minAllOneMultiple(int k) {
        int remainder = 0;

        for(int count = 1; count <= k; count++){
            remainder = (remainder * 10 + 1) % k;

            if(remainder == 0){
                return count;
            }
        }

        return -1;
    }
}