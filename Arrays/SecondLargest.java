public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 4, 6, 7, 3, 9, 1 };
        int secondLargest = 0;
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest)
            secondLargest = arr[i];
        }
        System.out.println(secondLargest);
    }
}
