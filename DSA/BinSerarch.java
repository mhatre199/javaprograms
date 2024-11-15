package DSA;

public class BinSerarch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};// strat=0, end=d, mid=4
        int i = binarySearch(arr, arr.length - 1, 60);//binarySearch(arr,arr.length-1,60)
        System.out.println("element is at"+arr[i]);

    }

    public static int binarySearch(int arr[], int n,int  target) {
        int start = 0;
        int end = n ;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            }

          mid=(start+end)/2;
        }
     return -1;

    }


}
