class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smol = new ArrayList<>();
        List<Integer> bigg = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for(int x : nums){
            if(x<pivot) smol.add(x);
            if(x==pivot) equal.add(x);
            if(x>pivot) bigg.add(x);
        }

        int[] ans = new int[nums.length];
        int i = 0;

        for(int x : smol) ans[i++] = x;
        for(int x : equal) ans[i++] = x;
        for(int x : bigg) ans[i++] = x;

        return ans;
    }
}