package _strings;

public class ReverseNo {

    public static void main(String[] args) {
     int a=1234;
//        StringBuffer stringBuffer = new StringBuffer(String.valueOf(a)); // int to string
//        StringBuffer reverse = stringBuffer.reverse();// int->str->sb
//        System.out.println(reverse.getClass().getName());
//        System.out.println(reverse);
//
//
//
//
//        Integer i = Integer.valueOf(String.valueOf(reverse));// sb->str>int
//        System.out.println(i.getClass().getName());
//        System.out.println(i);

int length=4;
int rev=0;
while(length!=0){
    int rem=a%10;// 4
    rev=rem+(rev*10);// 4
    a=a/10;  //123
    length--;
}
        System.out.println(rev);
    }
}
