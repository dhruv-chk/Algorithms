public class MaximumAndMinimum {
    public static void main(String[] args) {
        int arr[] = {4,5,8,2,9,6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n : arr){
            if(n>=max)
                max = n;
            if(n<=min){
                min = n;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
