package selectionSort;

public class selectionSort {

    public void sort(int[] arr){
        int sorted;
        int n = arr.length;
        for(sorted = 0; sorted < n-1; sorted++){
            int min_idx = sorted;
            for(int j = sorted+1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            //Swap elements
            int temp = arr[min_idx];
            arr[min_idx] = arr[sorted];
            arr[sorted] = temp;
        }
    }
}
