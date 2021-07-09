package arraylist;

import java.util.Arrays;

public class GenArraylist <E>{
    private int capacity;
    private int count;
    private E[] arrList;
    public GenArraylist(){
        count = 0;
        capacity = 10;
        arrList = (E[]) new Object[capacity];
    }
    public GenArraylist(int setCapacity){
        count = 0;
        capacity = setCapacity;
        arrList = (E[]) new Object[setCapacity];
    }
    public void add(E value){
        if(count+1 == capacity){
            resize();
            //ensureCapacity();
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
        for(int i = 0; i <= capacity-1; i++){
            if(arrList[i] == target){
                return true;
            }
        }
        return false;
    }

    public void resize(){
        E[] tempArray = (E[]) new Object[capacity];
        System.arraycopy(arrList, 0, tempArray, 0, capacity);
        capacity = capacity*2;
        arrList= null;
        arrList = (E[]) new Object[capacity];
        System.arraycopy(tempArray,0,arrList,0,capacity/2);
    }

    public void ensureCapacity(){
        int newCapacity = capacity*2;
        arrList = Arrays.copyOf(arrList,newCapacity);
    }

    public int getSize(){
        return capacity;
    }

    public int getCount(){
        return count;
    }

    public void printArr(){
        for(int i = 0; i <= capacity-1; i++){
            System.out.println("[" + arrList[i] + "]");
        }
    }

}
