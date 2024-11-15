package _strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOcurringCharacter {
    public static void main(String[] args) {
//        String str="I love my I country India";
//        String[] s2 = str.split(" "); // converts string ro  string array
//        Map<String, Integer> map= new LinkedHashMap<>();
//
//        System.out.println(Arrays.toString(s2) );
//for(int i=0; i<s2.length;i++){
//
//
//    String s = s2[i];
//    if(map.containsKey(s)){
//        map.put(s, map.get(s)+1);
//    }  else {
//        map.put(s,1);
//    }
//
//}
//map.entrySet().stream().forEach(x-> System.out.println(x));

        String str="I love my I country India".replaceAll(" ","");
       // String[] s2 = str.split(" "); // converts string ro  string array
        char[] ch = str.toCharArray();
        Map<Character, Integer> map= new LinkedHashMap<>();

//        System.out.println(Arrays.toString(s2) );
        for(int i=0; i<ch.length;i++){
//            char[] ch = str.toCharArray();

           // char ch1 = ch[i];
            // String s = s2[i];
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }  else {
                map.put(ch[i],1);
            }

        }
        map.entrySet().stream().forEach(x-> System.out.println(x));




    }



}
