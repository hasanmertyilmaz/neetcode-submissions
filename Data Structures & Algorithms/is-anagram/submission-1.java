class Solution {
    public boolean isAnagram(String s, String t) {
        int right = s.length();
        int left = t.length();
        if (right != left) {
            return false;
        }
        int count[] = new int[26];
        for(int i = 0; i < right; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < left; i++) {
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i]!= 0) {
                return false;
            }
        }
        return true;
    }
}

