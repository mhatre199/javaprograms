package _strings;

public class CountUppercase {

    public static void main(String[] args) {
       String str= "HumanCloud" ;
      // List l=new ArrayList<>();
       String s1=" ";
        int count=0;
        for(int i=0; i<str.length()-1;i++){

          if( Character.isUpperCase(str.charAt(i))) {
              count++;
              System.out.println(str.charAt(i));// HC printed
            }else{
       //  l.add(str.charAt(i));
              s1=s1+str.charAt(i)+" ";

          }

        }
        System.out.println(count);
     //   System.out.println("lowercase letters "+l);
        System.out.println(s1);
    }
}
