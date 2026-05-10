class Solution {
    public boolean isAnagram(String s, String t) {
        int firstNumber = s.length();
        int secondNumber = t.length();
        if (firstNumber != secondNumber) {
            return false;
        }
        int count[] = new int[26];
        for(int i = 0; i < firstNumber; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < secondNumber; i++) {
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

