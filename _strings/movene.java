package _strings;

import java.util.Arrays;

public class movene {
    public static void main(String[] args) {
        int arr[]={5,-3,3,9,2,-8,-6,-9};
        int j=0;
        for (int i = 0; i <arr.length ; i++) {
            if(0>arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                   j++;
            }
        }

        for (int a :arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr)+" ");

    }
}
