public class SubsetSum {
    public static int subset(int arr[], int sum, int n){
        if (n==0)
        return (sum==0)?1:0;

        return subset(arr, sum, n-1) + subset(arr, sum-arr[n-1], n-1);
    }
    public static void main(String[] args) {
        int sum = 25;
        int arr[] = {10, 20, 15};
        System.out.println(subset(arr, sum, arr.length));
    }
}
