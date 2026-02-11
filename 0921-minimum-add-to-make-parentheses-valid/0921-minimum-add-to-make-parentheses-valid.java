class Solution {
    public int minAddToMakeValid(String s) {
        int size = s.length();

        int open = 0, add = 0;
        for(int i = 0; i<size; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                if(open > 0){
                    open--;
                }else{
                    add++;
                }
            }
        }
        return add + open;
    }
}