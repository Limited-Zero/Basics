package stack;

public class GenStack <E>{
    private int size;
    private int top;
    private E[] storage;
    private boolean isFull = false;
    private boolean isEmpty = true;

    public GenStack(){
        size = 10;
    }

    public GenStack(int sizeStack){
        size = sizeStack;
        top = -1;
        storage = (E[]) new Object[sizeStack];
    }

    public void push(E value){
        if(isFull == true){
            throw new IndexOutOfBoundsException("Stack is full!");
        }
        else if(isEmpty = true){ isEmpty = false; }
        top++;
        storage[top] = value;
    }
    public E pop(){
        if(isEmpty == true){
            throw new IllegalArgumentException("Stack is empty");
        }
        E popped = storage[top];
        storage[top] = null;
        top--;
        return popped;
    }
    public int getSize(){return size;}
    public void setSize(int newSize){size = newSize;}
    public E getTop(){
        if(isEmpty()){ throw new RuntimeException("Empty Stack"); }
        return storage[top];
    }
    public boolean isFull(){ return isFull; }
    public boolean isEmpty(){return isEmpty;}
    public void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.println("[" + i + "] value: "+ storage[i]);
        }
    }

}
