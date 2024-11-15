package Arrays_programs;

public class SubarraySum {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3};
//        int target = 3;
//        int n = arr.length;
//        int count = 0;

//        for (int i = 0; i < n; i++) {
//            int sum=0;
//            for (int j = i; j < n; j++) {

//                sum = sum + arr[j];
//                if (sum == target) {
//                    count++;
//
//                }
//
//            }
//
//        System.out.println(count);
        int arr[]= {0,1,2,3};
        int k=3;

        int n=arr.length;

        int result=0;
        for (int i = 0; i <= n; i++) {
            int sum=0;

            for (int j = i+1; j < n; j++) {
                sum=sum+arr[j];

                if(sum==k)
//                    System.out.println(arr[i]+" : "+arr[j]);
                    result++;

            }
        }
        System.out.println("Sub Array sum is : "+result);
        }
    }



