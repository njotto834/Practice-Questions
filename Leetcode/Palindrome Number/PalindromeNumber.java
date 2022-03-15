class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        boolean result = true;
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (c1 != c2){
                result = false;
            }
            j--;
        }
        return result;
    }
}