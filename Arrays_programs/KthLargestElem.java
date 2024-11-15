package Arrays_programs;

public class KthLargestElem {
    public static void main(String[] args) {
        int[]arr={122,3,224,44};
        int k=2;
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
             // find max element so sort descend order
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

          if(i==k-1) {
           System.out.println(arr[i]);
          }
        }
    }


}
