class Solution {
    public boolean isSubsequence(String s, String t) {
        int flag = 0;
        for(int i = 0, j = 0; i < s.length() && j < t.length(); j++){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                flag++;
            }
        }
        return flag == s.length();
    }
}