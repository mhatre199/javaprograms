package _strings;

public class ConsonantsVovewls {
    public static void main(String[] args) {

        String str="My name is Siddhesh".replaceAll(" ","");
        char[] charArray = str.toCharArray();
        String vowels="aeiou";
        int count=0;
        for(int i=0; i< charArray.length;i++){
            char c = charArray[i];
            if(vowels.contains(String.valueOf(c))){
                count++;
            }


        }
        System.out.println(count);
    }

}
