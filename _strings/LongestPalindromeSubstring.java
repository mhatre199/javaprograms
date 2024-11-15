package _strings;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String str = "babad";

        String s = longestPalindromicSubstring(str);
        System.out.println(s);

    }


    public static String longestPalindromicSubstring(String str) {
        if (str.length() == 0 && str == null) {
            return " ";
        }
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String palindrome = isPalindrome(str, i, i);
            String notpalindrome = isPalindrome(str, i, i + 1);

            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            if (notpalindrome.length() > longest.length()) {
                longest = notpalindrome;
            }


        }

return longest;
    }

    public static String isPalindrome(String str, int left, int right) {

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        return str.substring(left + 1, right);
    }


}
