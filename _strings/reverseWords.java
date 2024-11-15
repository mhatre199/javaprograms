package _strings;

public class reverseWords {

    public static void reverse(char[] charArray, int n) {

                if (n > 0) {
            System.out.print(charArray[n - 1]);
            n--;
            reverse(charArray, n);
        }
    }

    public static void main(String[] args) {

        String str = " i am developer";
        reverse(str.toCharArray(), str.length());


    }

}
