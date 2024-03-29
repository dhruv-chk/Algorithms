public class MaximumDiffrenceinArray {

    // Maximum difference between two elements arr[i] and arr[j] where i>j.

    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        int res = arr[arr.length-1] - arr[0];
        int minVal = arr[0];

        for(int i = 1; i< arr.length; i++){
            res = Math.max(res, arr[i]-minVal);
            minVal = Math.min(minVal, arr[i]);
        }

        System.out.println(res);
    }
}
