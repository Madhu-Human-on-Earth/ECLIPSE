
public class validpalindrome {


    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if the clean string is a palindrome
        int left = 0;
        int right = cleanString.length() - 1;
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
    	validpalindrome solution = new validpalindrome();
        String input = "A man, a plan, a canal: Panama";
        boolean isPalindrome = solution.isPalindrome(input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
