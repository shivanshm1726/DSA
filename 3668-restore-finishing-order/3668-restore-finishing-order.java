class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int f : friends){
            set.add(f);
        }

        for(int id : order){
            if(set.contains(id)){
                ans.add(id);
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}