package Arrays_programs;

import java.util.Arrays;

public class NegativeToBeginning {
    public static void main(String[] args) {
        int[] arr = {12, -8, -5, 22, 44, -19};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
moveNegativeBeginning(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void moveNegativeBeginning(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

}
