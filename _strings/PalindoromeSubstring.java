package _strings;

public class
PalindoromeSubstring {
    public static void main(String[] args) {
        String str = "babad";
//        boolean palindrome = isPalindrome(str);
//        if(palindrome){
//            System.out.println("string palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
findPalindromeSubstring(str);

    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void findPalindromeSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) {
                    System.out.println(substring);

                }

            }
        }


    }


}
