public class MinimizeHeight {
    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 10};
        int k = 2;

        int median = arr.length%2==0? arr.length/2 - 1 : arr.length/2;

        for(int i=0; i<arr.length; i++){
            if(i<median)
                arr[i] = arr[i] + k;
            else
                arr[i] = arr[i] - k;
        }

        System.out.println(arr[arr.length-1] - arr[0]);
    }
}
