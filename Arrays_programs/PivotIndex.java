package Arrays_programs;

//Wap xalculate rught sum and left sum for particular index
public class PivotIndex {
    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 6, 5, 6};
        int x = bruteForce(arr);
        System.out.println(x);
    }

    public static int bruteForce(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int isum = 0;
            int rsum = 0;
            for (int j = 0; j < i; j++) {
                isum += arr[j];

            }
            // find Isum excluding current index
            for (int j = i + 1; j < arr.length; j++)
                rsum += arr[j];

            if (isum == rsum) {
                return i;}
            System.out.println("for index" + i + "Isum:" + isum + "rsum:" + rsum);
        }
        return -1;
    }

}
