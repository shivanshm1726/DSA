class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int num : nums1){
            setA.add(num);
        }
        for(int num : nums2){
            setB.add(num);
        }

        int[] res = new int[setA.size()];

        int k = 0;

        for(int num : setA){
            if(setB.contains(num)){
                res[k] = num;
                k++;
            }
        }

        return Arrays.copyOfRange(res, 0, k);
    }
}