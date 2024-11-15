package _strings;

public class tringObj {

    public static void main(String[] args) {
        String s1=new String("deepak");
        String s2=new String("rahul");
        String s3=new String("deepak");

        System.out.println(s1.equals(s3));  // check contevt
        System.out.println(s1==s3);  // check heap mem location

        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

        String s4="amit";
        String s5=s1.intern();   // createexact copy of string object in scp
        String s6="deepak";

        System.out.println(s5==s6);  //mem loc
        System.out.println(s5.equals(s6)); // content
        System.out.println(s5==s1);  //mem loc

        System.out.println(s1.hashCode());
        System.out.println(s5.hashCode());



    }




}
