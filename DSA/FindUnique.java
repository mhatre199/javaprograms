package DSA;


//find only one unique
public class FindUnique {
    public static int getUnique(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer ^ arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 78, 3, 2, 1, 5, 6, 4};  // 78 will be unique
        int unique = getUnique(arr);
        System.out.println(unique);  // Output will be 78
    }
}
