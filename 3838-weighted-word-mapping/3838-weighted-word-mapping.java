class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();

        for(String word : words){
            int total = 0;
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                total += weights[ch - 'a'];
            }
            int mod = total % 26;
            char mapped = (char)('z' - mod);
            ans.append(mapped);
        }

        return ans.toString();
    }
}