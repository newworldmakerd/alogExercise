package longestPalindromeSubstring;

class Solution {
    public String longestPalindrome(String s) {
        String rel = "";
        for (int i = 0;i<s.length();i++){
            String s1 = getLongestString(s,i,i);
            String s2 = getLongestString(s,i,i+1);
            rel = s1.length()>rel.length()?s1:rel;
            rel = s2.length()>rel.length()?s2:rel;
        }
        return rel;
    }
    public String getLongestString(String s,int l,int r){
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            r++;
            l--;
        }
        return s.substring(l+1,r);
    }
}
