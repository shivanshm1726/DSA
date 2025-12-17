class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int i = 0;

        for(int num = 1; num <= n && i < target.length; num++){
            ops.add("Push");

            if(num == target[i]){
                i++;
            }else{
                ops.add("Pop");
            }
        }

        return ops;
        
    }
}