package _strings;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Siddhesh";
   String rev="";

   for(int i=str.length()-1;i>=0;i--){

     rev=rev+ str.charAt(i);
   }
        System.out.println("reverse of string is: "+rev);

        if(str.equals(rev)){

            System.out.println("string is palindrome");
        }else{
            System.out.println("string not palindrome");
        }
    }







}
