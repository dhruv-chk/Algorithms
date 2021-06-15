public class MinimumJumpToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        int i = 0, count = 0;

        while(i<arr.length-1){
            if(arr[i] == 0)
                break;
            
            count++;
            i=i+arr[i];
        }

        System.out.println(count);
    }
}
