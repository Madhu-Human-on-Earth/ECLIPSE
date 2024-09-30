import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int longestPalindrome(String s) {
        int[] chars = new int[52];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                chars[c - 'a']++;
            } else {
                chars[c - 'A' + 26]++;
            }
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count += chars[i] / 2;
        }
        count = count * 2;
        return Math.min(s.length(), count + 1);
    }

    public static void main(String[] args) {
    	LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abccccdd";
        int longestPalindromeLength = solution.longestPalindrome(input);
        System.out.println("Longest Palindrome Length: " + longestPalindromeLength);
    }
}
