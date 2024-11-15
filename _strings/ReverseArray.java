package _strings;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,-3,3,9,2,-8,-6,-9};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
//        int j=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(0>arr[i]){
//               int temp=arr[i];
//               arr[i]=arr[j];
//               arr[j]=temp;
//               j++;
//            }
//        }
//        for (Integer a:arr){
//            System.out.print( a+" ");
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
