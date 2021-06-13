package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    
        int left = 0, right = arr.length-1, temp;

        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int n : arr){
            System.out.println(n);
        }

    }
}
