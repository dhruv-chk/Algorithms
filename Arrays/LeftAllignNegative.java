public class LeftAllignNegative {
    public static void main(String[] args) {
        int[] arr = {-12,11,-13,-5,6,-7,5,-3,-6};

        int l = 0, r=arr.length-1;

        while(l<=r){
            if(arr[l]>=0&&arr[r]>=0)
                r--;
            else if(arr[l]>=0&&arr[r]<0){
                swap(arr, l, r);
                l++;
                r--;
            }
            else if(arr[l]<0&&arr[r]<0)
                l++;
            else{
                l++;
                r--;
            }
        }

        for(int n : arr){
            System.out.print(n + ", ");
        }

    }

    static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
