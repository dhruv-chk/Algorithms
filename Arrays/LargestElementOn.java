public class LargestElementOn {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 4, 6, 7, 3, 9, 1 };
        int largestindex = 0;
        int largestelement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestelement) {
                largestelement = arr[i];
                largestindex = i;
            }
        }
        System.out.println(largestindex);
        System.out.println(largestelement);
    }
}
