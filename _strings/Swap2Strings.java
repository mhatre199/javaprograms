package _strings;

public class Swap2Strings {
    public static void main(String[] args) {

        String str1="nikhil";
        String str2= "nath";
//// swap using 3 variables
//        String str3=str1;
//        str1=str2;
//        str2=str3;
//        System.out.println(str1);
//        System.out.println(str2);
// swap without 3rd variable

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }
}
