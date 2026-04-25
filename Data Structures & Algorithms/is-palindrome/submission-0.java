class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "", rev = "";
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1 = s1 + s.charAt(i);
                rev = s.charAt(i) + rev;
            }
        }
        return rev.equals(s1);
    }
}
