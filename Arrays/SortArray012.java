public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0,1};

        int low = 0, mid = 0, high = arr.length-1;

        while(mid <= high){
            switch(arr[mid]){
                case 0: swap(arr, low, mid);
                low++;
                mid++;
                break;
                case 1: mid ++ ;
                break;
                case 2: swap(arr, mid, high);
                high--;
                break;
            }
        }

        for(int n: arr){
            System.out.println(n);
        }
    }

    static void swap (int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
