class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        for(int i = s.length() - 1, count = 0; i>=0; i--) {
            char temp = s.charAt(i);
            if (temp != ' ') count++;
            if (temp == ' ' || i == 0) return count;
        }
        return 0;
    }
}