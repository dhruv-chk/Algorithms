public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp = arr[0], i;
        for (i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[i-1]= temp;
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
