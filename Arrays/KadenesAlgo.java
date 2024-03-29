public class KadenesAlgo {
    public static void main(String[] args) {
        int arr[] = {-5,1,-2,3,-1,2,-2};
        // Find the maximum sum of a subarray.
        // In this case the maximum sum is 4 for the sub array 3, -1, 2.
        
        int maxEnding = arr[0], res = arr[0];

        for(int i=1; i<arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        System.out.println(res);

    }
    
}
