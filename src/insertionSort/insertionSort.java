package insertionSort;

public class insertionSort {

    public void sort(int array[]){
        for(int i = 1; i < array.length; i++){
            int key = array[i]; //Registers the Smallest item in process
            int pointer = i-1; //Compares Number Against Keys

            //Loop looks for pointer and compares array[pointer] with key
            while((pointer > -1) && (array[pointer] > key)){
                array[pointer+1] = array[pointer];
                pointer--;
            }
            array[pointer+1] = key;
        }
    }

    public static void printer(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String []args){
        int arr[] = {33, 21, 54, 9, 4, 19, 32, 98, 43};
        insertionSort newSort = new insertionSort();
        newSort.sort(arr);
        printer(arr);
    }
}
