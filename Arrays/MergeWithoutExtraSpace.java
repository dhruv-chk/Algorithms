public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {10, 12};
        int arr2[] = {5, 18, 20};

        for(int i=arr1.length-1; i>=0; i--){
            int last = arr2[arr2.length-1];
            
            int j;
            for(j = arr2.length-2; j>=0&&arr1[j]>arr2[j]; j--){
                arr1[j+1] = arr1[j];
            }
            if(j!=arr2.length-2 || last> arr2[i]){
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }

        for(int n: arr1){
            System.out.println(n);
        }
        for(int n: arr2){
            System.out.println(n);
        }
    }
}
