public class LeftRotateByN {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 2;
        reverse(arr, 0, n-1);
        reverse(arr, n, 5-1);
        reverse(arr, 0, 5-1);

        for (int i = 0; i<5; i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int[] arr, int low, int high){

        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

    }
}
