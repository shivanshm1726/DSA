class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int num = 0;

        for(int i = 1; i<=n && num<target.length; i++){
            list.add("Push");

            if(i == target[num]){
                num++;
            }else{
                list.add("Pop");
            }
        }
        return list;
    }
}