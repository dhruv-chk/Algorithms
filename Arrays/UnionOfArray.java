import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3};

        HashSet<Integer> unionSet= new HashSet<>();

        for(int n: arr1){
            if (!unionSet.contains(n))
                unionSet.add(n);
        }
        
        for(int n : arr2){
            if (!unionSet.contains(n))
                unionSet.add(n);
        }

        System.out.println(unionSet.);
    }
}
