package Arrays_programs;

public class FirstDuuplicate {

    public static void main(String[] args) {

        int arr[]={12,4,5,6,4,3,2,5};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    temp++;
                    break;
                }
            }
            if(temp>0){
                break;
            }
        }

    }



}
