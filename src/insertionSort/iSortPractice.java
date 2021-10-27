package insertionSort;

public class iSortPractice {
    public void sort(int arr[]){
        for(int i = 1; i< arr.length; i++){
            int smallest = arr[i];
            int pointer;
            for(pointer = i-1; pointer > -1 && arr[pointer] > smallest; pointer--){
                arr[pointer+1] = arr[pointer]; //Swap values
            }
            arr[pointer+1] = smallest;
        }
    }

    public static void printer(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String []args){
        int arrayNum[] = {32, 44,10,4,61,29,16,30};
        iSortPractice sorter = new iSortPractice();
        sorter.sort(arrayNum);
        printer(arrayNum);
    }
}
