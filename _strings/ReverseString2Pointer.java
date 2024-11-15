package _strings;

public class ReverseString2Pointer {

    public static void main(String[] args) {
        String str="Siddhesh";

        System.out.println(revString(str));

    }
    public static String revString(String str){
        int start=0;
        int end=str.length()-1;

        char[] charArray = str.toCharArray();
        while(start<=end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        str = new String(charArray);

        return str;

    }

}
