public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 4, 6, 7, 3, 9, 1 };
        int secondLargest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
