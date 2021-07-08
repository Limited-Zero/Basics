package arraylist;

public class GenArraylist <E>{
    private int size;
    private int count;
    private E[] arrList;
    public GenArraylist(){
        size = 10;
        count = 0;
        arrList = (E[]) new Object[size];
    }
    public GenArraylist(int setSize){
        count = 0;
        size = setSize;
        arrList = (E[]) new Object[setSize];
    }
    public void add(E value){
        if(count+1 == size){
            throw new IndexOutOfBoundsException("Array full");
        }
        arrList[count] = value;
        count++;
    }
    public E remove(int index){
        E target = arrList[index];
        arrList[index] = null;
        return target;
    }

    public boolean searchFor(E target){
        for(int i = 0; i <= size-1; i++){
            if(arrList[i] == target){
                return true;
            }
        }
        return false;
    }

    public void printArr(){
        for(int i = 0; i <= size-1; i++){
            System.out.println("[" + arrList[i] + "]");
        }
    }

}
