package Arrays_programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesArr {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5};
        List<Integer>list=new ArrayList<>();

//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] != arr[i+1]){
//                list.add(arr[i] );
//            }
//            list.add(arr[arr.length-1]);
//        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] !=arr[i+1]) {
                list.add(arr[i]);
                //			j=a[i];
            }
        }
        list.add(arr[arr.length-1]);





        System.out.println(list);

    }


}
