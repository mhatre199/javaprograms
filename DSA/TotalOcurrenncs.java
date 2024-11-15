package DSA;

public class TotalOcurrenncs {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 30, 40, 50, 60, 70};
      int target=30;

        int z = totalOcurrence(arr, arr.length - 1, 30);
        System.out.println("total ocurrence is : "+z);

    }
    public static int totalOcurrence(int arr[], int n, int target){
        int firsto = firstOcurrence(arr, n, target);// gives position of index
        int lasto = lastOcurrence(arr, n, target);// gives position of index
       int  totalo= lasto-firsto+1;
        return totalo;


    }

    public static int firstOcurrence(int arr[], int n, int target) {
        int start = 0;
        int end = n;
        int ans = -1;

        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
        return ans;
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
