package DSA;

public class FindLastOcurrenceBinSearc {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60,60, 70, 80, 90};// strat=0, end=d, mid=4
        int i = lastOcurrence(arr, arr.length - 1, 60);//binarySearch(arr,arr.length-1,60)
        System.out.println("target is at position"+i);
    }
    public static int lastOcurrence(int arr[], int n,int  target) {
        int start = 0;
        int end = n ;
        int ans=-1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                ans=mid;
                start=mid+1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            }

            mid=(start+end)/2;
        }
        return ans;

    }





}
