package _strings;

public class ReverseWordsinString {
    public static void main(String[] args) {
        String str = "My name is Siddhesh";

        String[] words = str.split(" ");

        // System.out.println(s);
        for (int i = 0; i < words.length; i++) {
            String revword = " ";
            String word = words[i];
//            System.out.println(word);

            for (int j = word.length() - 1; j >= 0; j--) {

                revword = revword + word.charAt(j);
            }
            System.out.print(revword+" ");
        }


    }
}
