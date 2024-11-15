package DSA;

public class FindFirstOcurrenceBinSearrch {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 30, 40, 50, 60, 70};
        //strat=0,end=8,mid=4
        //int ans=-1, target=30;
        int i = firstOcurrence(arr, arr.length - 1, 30);
        System.out.println("target is at position "+i);


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


}