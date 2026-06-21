class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int sign = 1;
        int ans = 0;
        int i = 0;

        //1.
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        //2.

        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        //3. 
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            //Overflow check
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
            ans = (ans * 10) + digit;
            i++;
        }

        return ans * sign;
    }
}